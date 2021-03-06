package com.adriantache.bigfivepersonalitytest.viewmodel

import androidx.lifecycle.ViewModel
import com.adriantache.bigfivepersonalitytest.utils.*

/**
 * ViewModel class for ResultsActivity
 **/

class ResultsViewModel(resultsMap: HashMap<String, Int>, private val filename: String) : ViewModel() {
    private val sortedList: List<Pair<String, Int>> = resultsMap.toList().sortedByDescending { it.second }
    val openness = resultsMap["Openness"]?.toFloat() ?: -1f
    val conscientiousness = resultsMap["Conscientiousness"]?.toFloat() ?: -1f
    val extraversion = resultsMap["Extraversion"]?.toFloat() ?: -1f
    val agreeableness = resultsMap["Agreeableness"]?.toFloat() ?: -1f
    val neuroticism = resultsMap["Neuroticism"]?.toFloat() ?: -1f

    lateinit var descriptionText: String
    lateinit var resultsText: String

    init {
        generateDescription()
        generateResultsText()
    }

    private fun generateDescription() {
        descriptionText = "Thank you for completing the " +
                when (filename) {
                    IPIP_20 -> "20 item Mini-IPIP"
                    IPIP_50 -> "50 item IPIP-NEO-PI-R"
                    NEO_50 -> "50 item NEO-PI-R"
                    NEO_100 -> "100 item NEO-PI-R"
                    DYP_100 -> "DeYoung, Quilty and Peterson 100-item NEO-PI-R"
                    JOHN_120 -> "Johnson 120 item IPIP-NEO-PI-R"
                    MAPLES_120 -> "Maples 120 item IPIP NEO-PI-R"
                    CM_300 -> "Costa and McCrae 300 item IPIP-NEO-PI-R"
                    else -> ERROR
                } + " version of the Big Five Markers personality test. You can find additional details " +
                "about this test by going to ipip.ori.org or visiting the Wikipedia entry using the button " +
                "below. Please note that the results of this test are not saved, so we recommend taking a " +
                "screenshot or using the share button at the top to save them to your desired destination."
    }

    //todo there's probably a smarter way to build this text
    //todo find solution to equality between 3 and 4
    private fun generateResultsText() {
        val key = mapOf(
                "Extraversion" to ("inventive or curious" to "consistent or cautious"),
                "Agreeableness" to ("efficient or organized" to "easy-going or careless"),
                "Conscientiousness" to ("outgoing or energetic" to "solitary or reserved"),
                "Openness" to ("friendly or compassionate" to "challenging or detached"),
                "Neuroticism" to ("sensitive or nervous" to "secure or confident")
        )

        val (firstTrait,
                secondTrait,
                thirdTrait,
                fourthTrait,
                fifthTrait
        ) = sortedList.take(5).map { it.first }

        //detect oddness (check if all dimensions are equal)
        if (sortedList.takeLast(4).all { it.second == sortedList.first().second }) {
            resultsText = "You seem bizarrely average... \nHave you been using the cheating function?"
            return
        }

        //select two or three main traits, in case of equality
        val equality =
                (sortedList.component1().second == sortedList.component2().second ||
                        sortedList.component2().second == sortedList.component3().second)

        resultsText = "It seems that $firstTrait"
        resultsText += if (equality) ", $secondTrait and $thirdTrait"
        else " and $secondTrait"
        resultsText += " are your primary traits. This means that you are probably more "
        resultsText += key[firstTrait]?.first ?: ERROR
        resultsText += if (equality) ", ${key[secondTrait]?.first
                ?: ERROR} and ${key[thirdTrait]?.first ?: ERROR}"
        else " and ${key[secondTrait]?.first ?: ERROR}"
        resultsText += " as well as more "
        resultsText += if (equality) "${key[fourthTrait]?.first
                ?: ERROR} and ${key[fifthTrait]?.first ?: ERROR}."
        else "${key[thirdTrait]?.first ?: ERROR}, ${key[fourthTrait]?.first
                ?: ERROR} and ${key[fifthTrait]?.first ?: ERROR}."
    }

    //calculate chart minimum value
    fun getChartMin(): Float {
        val min = sortedList.component5().second.toFloat()
        val max = sortedList.component1().second.toFloat()

        if (min == max || max == 0f) return min - 0.1f

        //we want more bottom space if values are close together
        val interval = (max - min) / max

        return min * (1 - 0.05f * (1 / interval))
    }

    //calculate chart maximum value to ensure the label is visible
    fun getChartMax(): Float = sortedList.component1().second + 0.11f

    //list of traits and scores
    fun getSummaryText(): String = sortedList.fold("") { acc, pair -> acc + "${pair.first}: ${pair.second}  " }
}

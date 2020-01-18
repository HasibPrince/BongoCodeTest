package com.bdcom.bongocodetest

import java.util.*

object AnagramChecker {
    fun isAnagramUsingMap(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val mapInput = HashMap<Char, Int>()

        for (c in s.toCharArray()) {
            var value = mapInput[c]
            mapInput[c] = if (value == null) 1 else ++value
        }

        val map = HashMap<Char, Int>()

        for (c in t.toCharArray()) {
            var value = map[c]
            map[c] = if (value == null) 1 else ++value
        }

        for (c in map.keys) {
            val value = map[c]
            val inputValue = mapInput[c]
            if (inputValue == null || value != inputValue) {
                return false
            }
        }

        return true
    }

    fun isAnagramUsingSort(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val sArray = s.toCharArray()
        Arrays.sort(sArray)

        val tArray = t.toCharArray()
        Arrays.sort(tArray)

        for (i in 0 until s.length) {
            if (sArray[i] != tArray[i]) {
                return false
            }
        }
        return true
    }
}
package com.bdcom.bongocodetest

import org.junit.Test

import org.junit.Assert.*

class AnagramTest {

    @Test
    fun testAnagramUsingMap(){
        var result = AnagramChecker.isAnagramUsingMap("bleat","table")
        assertTrue(result)

        result = AnagramChecker.isAnagramUsingMap("eat","tar")
        assertFalse(result)
    }

    @Test
    fun testAnagramUsingSort(){
        var result = AnagramChecker.isAnagramUsingSort("bleat","table")
        assertTrue(result)

        result = AnagramChecker.isAnagramUsingSort("eat","tar")
        assertFalse(result)
    }
}
package org.example.app

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class SmokeTest {
    @Test
    fun testEnvironmentIsHealthy() {
        // Simple sanity test to ensure test discovery works in CI
        assertTrue(true)
    }
}

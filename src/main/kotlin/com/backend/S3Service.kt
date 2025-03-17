package com.backend

import org.springframework.stereotype.Service

@Service
interface S3Service {
    fun getBucketNames(): List<String>
}
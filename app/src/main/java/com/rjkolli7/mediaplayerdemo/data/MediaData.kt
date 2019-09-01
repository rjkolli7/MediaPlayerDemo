package com.rjkolli7.mediaplayerdemo.data

data class MediaData(
    var storagePath: String?,
    var mediaType: MediaType?,
    var title: String?,
    var duration: String?
)

enum class MediaType {
    AUDIO,
    VIDEO
}

package com.api.TaveShot.domain.post.comment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CommentEditRequest {
    private final String comment;
}
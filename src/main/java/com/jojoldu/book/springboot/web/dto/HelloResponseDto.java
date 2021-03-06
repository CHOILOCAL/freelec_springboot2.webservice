package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
// 'final' 선언된 모든 필드에 생성자 생성
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}

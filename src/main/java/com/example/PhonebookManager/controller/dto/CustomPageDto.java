package com.example.PhonebookManager.controller.dto;

import java.util.List;

public record CustomPageDto<T>(List<T> content, int page, int size, long totalElements) {
}

package com.services.pixabay.presentation.dto;

import java.util.List;

import com.services.common.presentation.dto.ApiResponse;

public record PixabayResponse<T>(
        String total,
        String totalHits,
        List<T> hits
    ) implements ApiResponse<T> {

    @Override
    public List<T> getItems() {
        return hits;
    }

    @Override
    public String getTotal() {
        return total;
    }
            
    public static <T> PixabayResponse<T> of(String total, String totalHits, List<T> hits) {
        return new PixabayResponse<T>(total, totalHits, hits);
    }
}

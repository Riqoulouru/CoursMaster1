package org.example.mapper;

import org.example.dto.ItemResponseDto;
import org.example.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public ItemResponseDto toResponseDto(Item item) {
        return new ItemResponseDto(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.isDone()
        );
    }
}

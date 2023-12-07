package com.demointerview.mapper;


import com.demointerview.models.DirectorDetailsEntity;
import com.demointerview.dto.Director;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DirectorMapper {
    List<Director> domainToDto(List<DirectorDetailsEntity> entities);
}

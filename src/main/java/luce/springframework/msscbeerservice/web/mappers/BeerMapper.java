package luce.springframework.msscbeerservice.web.mappers;

import luce.springframework.msscbeerservice.domain.Beer;
import luce.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}

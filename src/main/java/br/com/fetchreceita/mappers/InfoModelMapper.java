package br.com.fetchreceita.mappers;

import br.com.fetchreceita.dto.InfoReceitaDto;
import br.com.fetchreceita.models.InfoReceitaModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class InfoModelMapper {
    public static final InfoModelMapper INSTANCE = Mappers.getMapper(InfoModelMapper.class);

    @Mapping(target = "atividadePrincipal", source = "atividadePrincipal")
    @Mapping(target = "dataSituacao", source = "dataSituacao")
    @Mapping(target = "atividadesSecundarias", source = "atividadesSecundarias")
    @Mapping(target = "qsa", source = "qsa")
    @Mapping(target = "natureza", source = "natureza")
    @Mapping(target = "capitalSocial", source = "capitalSocial")
    public abstract InfoReceitaModel mapFrom(final InfoReceitaDto source);

}

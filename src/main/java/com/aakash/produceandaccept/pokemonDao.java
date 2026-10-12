package com.aakash.produceandaccept;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement
public class pokemonDao {

    private String pokemonName;
    private String pokemonType;
    private String pokemonColor;
    private String pokemonSize;

}

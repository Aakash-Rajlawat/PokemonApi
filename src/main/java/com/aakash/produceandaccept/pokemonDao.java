package com.aakash.produceandaccept;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class pokemonDao {

    private String pokemonName;
    private String pokemonType;
    private String pokemonColor;
    private String pokemonSize;

}

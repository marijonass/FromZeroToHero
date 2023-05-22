package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter

public class Irasas {
    private Integer id;
    private Category kategorija;
    private LocalDateTime data;
    private Double suma;
    private String komentaras;

    public Irasas( Category kategorija, LocalDateTime data, Double suma, String komentaras) {
        this.id = id;
        this.kategorija = kategorija;
        this.data = LocalDateTime.from(data);
        this.suma = suma;
        this.komentaras = komentaras;
    }

    public Irasas(Integer id) {
        this.id = id;
    }
    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Irasas{" +
                "id=" + id +
                ", kategorija=" + kategorija +
                ", data=" + data +
                ", suma=" + suma +
                ", komentaras='" + komentaras + '\'' +
                '}';
    }
}

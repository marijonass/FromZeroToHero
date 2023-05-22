package org.example;

import lombok.NoArgsConstructor;

import static java.lang.String.format;
@NoArgsConstructor
public enum Category {
    ISLAIDOS,
    PAJAMOS;

    public static Category getByName(String kategorijaStr)throws BackToMainMenuException {

        for (Category k : Category.values())
            if (kategorijaStr.equalsIgnoreCase(k.toString()))
                return k;
        throw new BackToMainMenuException(format("Tokios kategorijos nera %s", kategorijaStr));
    }

}

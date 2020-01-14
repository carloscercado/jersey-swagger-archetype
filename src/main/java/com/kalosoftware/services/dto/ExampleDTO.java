package com.kalosoftware.services.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class ExampleDTO extends DTOFacade<ExampleDTO> {

    @NotNull()
    private String notNull;

    @Min(5)
    private int minFive;

    @Max(10)
    private int maxTen;
    
    @Email()
    private String email;

    public ExampleDTO() {
    }

    public ExampleDTO(String notNull, int minFive, int maxTen) {
        this.notNull = notNull;
        this.minFive = minFive;
        this.maxTen = maxTen;
    }

    public String getNotNull() {
        return notNull;
    }

    public void setNotNull(String notNull) {
        this.notNull = notNull;
    }

    public int getMinFive() {
        return minFive;
    }

    public void setMinFive(int minFive) {
        this.minFive = minFive;
    }

    public int getMaxTen() {
        return maxTen;
    }

    public void setMaxTen(int maxTen) {
        this.maxTen = maxTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
    

}

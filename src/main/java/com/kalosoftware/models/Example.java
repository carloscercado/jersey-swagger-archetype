package com.kalosoftware.models;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class Example {
    
    private String oneProperties;
    private String otherProperties;

    public Example(String oneProperties, String otherProperties) {
        this.oneProperties = oneProperties;
        this.otherProperties = otherProperties;
    }

    public Example() {
    }

    public String getOneProperties() {
        return oneProperties;
    }

    public void setOneProperties(String oneProperties) {
        this.oneProperties = oneProperties;
    }

    public String getOtherProperties() {
        return otherProperties;
    }

    public void setOtherProperties(String otherProperties) {
        this.otherProperties = otherProperties;
    }
    
    

}

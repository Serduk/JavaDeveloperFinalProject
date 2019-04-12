package com.nutritionalsupplements.entity;

public enum SupplementDanger {
    not_assigned("Не указана"),
    zero("Нулевая"),
    very_low("Очень низкая"),
    low("Низкая"),
    middle("Средняя"),
    high("Высокая"),
    very_high("Очень высокая");

    SupplementDanger(String description) {
        this.description = description;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public static SupplementDanger fromDescription(String description){
        for(SupplementDanger value : SupplementDanger.values()){
            if(value.getDescription().equalsIgnoreCase(description)){
                return value;
            }
        }
        return null;
    }
}
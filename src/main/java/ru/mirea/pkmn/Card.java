package ru.mirea.pkmn;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Card implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;


    private PokemonStage pokemonStage;
    public PokemonStage getPokemonStage() {
        return pokemonStage;
    }
    public void setPokemonStage(PokemonStage value) {
        pokemonStage = value;
    }


    public Card() {
    }



    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private int hp;
    public int getHp() {
        return hp;
    }
    public void setHp(int value) {
        hp = value;
    }


    private EnergyType energyType;
    public EnergyType getEnergyType() {
        return energyType;
    }
    public void setEnergyType(EnergyType value) {
        energyType = value;
    }


    private Card evolvesFrom;
    public Card getEvolvesFrom() {
        return evolvesFrom;
    }
    public void setEvolvesFrom(Card value) {
        evolvesFrom = value;
    }


    private List<AttackSkill> skills;
    public List<AttackSkill> getSkills() {
        return skills;
    }
    public void setSkills(List<AttackSkill> values) {
        skills = values;
    }


    private EnergyType weaknessType;
    public EnergyType getWeaknessType() {
        return weaknessType;
    }
    public void setWeaknessType(EnergyType value) {
        weaknessType = value;
    }


    private EnergyType resistanceType;
    public EnergyType getResistanceType() {
        return resistanceType;
    }
    public void setResistanceType(EnergyType value) {
        resistanceType = value;
    }


    private String retreatCost;
    public String getRetreatCost() {
        return retreatCost;
    }
    public void setRetreatCost(String value) {
        retreatCost = value;
    }


    private String gameSet;
    public String getGameSet() {
        return gameSet;
    }
    public void setGameSet(String value) {
        gameSet = value;
    }


    private char regulationMark;
    public Character getRegulationMark() {
        return regulationMark;
    }
    public void setRegulationMark(Character value) {
        regulationMark = value;
    }

    private Student pokemonOwner;
    public Student getPokemonOwner() {
        return pokemonOwner;
    }
    public void setPokemonOwner(Student value) {
        pokemonOwner = value;
    }


    @Override
    public String toString() {
        return "Card{" + '\n' +
                "pokemonStage=" + pokemonStage + ',' + '\n' +
                "name='" + name + '\'' + ',' + '\n' +
                "hp=" + hp + ',' + '\n' +
                "energyType=" + energyType + ',' + '\n' +
                "evolvesFrom=" + evolvesFrom + ',' + '\n' +
                "skills=" + skills + ',' + '\n' +
                "weaknessType=" + weaknessType + ',' + '\n' +
                "resistanceType=" + resistanceType + ',' + '\n' +
                "retreatCost=" + retreatCost + ',' + '\n' +
                "gameSet=" + gameSet + ',' + '\n' +
                "regulationMark=" + regulationMark + ',' + '\n' +
                "pokemonOwner=" + pokemonOwner + '\n' +
                '}';
    }
}

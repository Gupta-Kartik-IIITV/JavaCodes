package OOPs;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class RecipeTest{

    public static void main(String[] args) {

        Ingredient maggi = new Ingredient("Maggi","Pcs",15);
        Ingredient water = new Ingredient("Water","Ltr",0);
        Ingredient masala = new Ingredient("Maggi Masala","Pcs",5);
        Ingredient onion = new Ingredient("Onion","Kgs",0.2f);

        Instructions makeMaggi1 = new Instructions(7,5,2,"Switzerland","Maggi Noodles","Snack",4);

        makeMaggi1.addIngredients(maggi);
        makeMaggi1.addIngredients(water);
        makeMaggi1.addIngredients(masala);
        makeMaggi1.addIngredients(onion);

        System.out.println(makeMaggi1.getApproximateTimeToCook() + " mins");
        System.out.println(makeMaggi1.getServingSize());
        System.out.println(makeMaggi1.getRecipeType());
        System.out.println(makeMaggi1.getRecipeName());


        Instructions Copy = makeMaggi1.deepCopy();

        System.out.println(Copy.getApproximateTimeToCook() + " mins");
        System.out.println(Copy.getServingSize());
        System.out.println(Copy.getRecipeType());
        System.out.println(Copy.getRecipeName());

        Copy.setOrigin("India");
        Copy.setRecipeName("Ramen");

        System.out.println(Copy.getOrigin());
        System.out.println(makeMaggi1.getOrigin());

        System.out.println(Copy.getRecipeName());
        System.out.print(makeMaggi1.getRecipeName());

    }
}

class Ingredient{
    public String nameOfIngredient;
    public String unitType;
    public float price;

    public Ingredient(String nameOfIngredient, String unitType, float price) {
        this.nameOfIngredient = nameOfIngredient;
        this.unitType = unitType;
        this.price = price;

    }
}

class Recipe {

    private float approximateTimeToCook;
    private float servingSize;

    private String recipeName;

    private String recipeType;

    private String  Origin;

    Recipe(){}

    Recipe(String origin,String recipeName, String recipeType){
        this.recipeName = recipeName;
        this.Origin = origin;
        this.recipeType = recipeType;
    }

    Recipe(float approximateTimeToCook,float servingSize,String origin,String recipeName,String recipeType){
        this.recipeName = recipeName;
        this.Origin = origin;
        this.recipeType = recipeType;
        this.approximateTimeToCook = approximateTimeToCook;
        this.servingSize = servingSize;
    }

    public float getApproximateTimeToCook() {
        return this.approximateTimeToCook;
    }

    public float getServingSize() {
        return this.servingSize;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public String getRecipeType() {
        return this.recipeType;
    }

    public String getOrigin() {
        return this.Origin;
    }

    public void setApproximateTimeToCook(float approximateTimeToCook) {
        this.approximateTimeToCook = approximateTimeToCook;
    }

    public void setServingSize(float servingSize) {
        this.servingSize = servingSize;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}

class Ingredients extends Recipe{
    int numberOfIngredients;
    public ArrayList<Ingredient> ingredientsList = new ArrayList<>();
    Ingredients(){
    }
    Ingredients(int numberOfIngredients){
        this.numberOfIngredients = numberOfIngredients;
    }

    Ingredients(int numberOfIngredients,float approximateTimeToCook,float servingSize,String origin,String recipeName,String recipeType){
        super(approximateTimeToCook, servingSize, origin, recipeName, recipeType);
        this.numberOfIngredients = numberOfIngredients;

    }

}

class Instructions extends Ingredients{
    int numberOfSteps;
    private ArrayList<String> steps = new ArrayList<>();

    public Instructions(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    Instructions(int numberOfSteps, float approximateTimeToCook,float servingSize,String origin,String recipeName,String recipeType, int numberOfIngredients){
        super(numberOfIngredients, approximateTimeToCook, servingSize, origin, recipeName, recipeType);
        this.numberOfSteps = numberOfSteps;
    }

    void addIngredients(Ingredient ing){
        ingredientsList.add(ing);
    }

    public Instructions deepCopy(){
        Instructions copy = new Instructions(this.numberOfSteps,this.getApproximateTimeToCook(),this.getServingSize(),this.getOrigin(),this.getRecipeName(),this.getRecipeType(),this.numberOfIngredients);
        for(int i=0;i<ingredientsList.size();i++){
            copy.ingredientsList.add(ingredientsList.get(i));
        }
        return copy;
    }
}

package Advanced.E_DefiningClasses.Google;

import java.util.List;

public class Person {
    private String personName;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    public Person(String personName, List<Pokemon> pokemons, List<Parent> parents, List<Child> children) {
        this.personName = personName;
        this.pokemons = pokemons;
        this.parents = parents;
        this.children = children;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s\nCompany:\n", this.personName));

        if (this.getCompany() != null) {
            sb.append(String.format("%s %s %.2f\n",
                    this.getCompany().getCompanyName(),
                    this.getCompany().getDepartment(),
                    this.getCompany().getSalary()));
        }

        sb.append("Car:\n");

        if (this.getCar() != null) {
            sb.append(String.format("%s %d\n",
                    this.getCar().getCarModel(),
                    this.getCar().getCarSpeed()));
        }

        sb.append("Pokemon:\n");

        if (this.getPokemons() != null) {
            this.getPokemons().forEach(el -> sb.append(String.format("%s %s\n", el.getPokemonName(), el.getPokemonType())));
        }

        sb.append("Parents:\n");

        if (this.getParents() != null) {
            this.getParents().forEach(el -> sb.append(String.format("%s %s\n", el.getParentName(), el.getParentBirthday())));
        }

        sb.append("Children:\n");

        if (this.getChildren() != null) {
            this.getChildren().forEach(el -> sb.append(String.format("%s %s\n", el.getChildName(), el.getChildBirthday())));
        }

        return sb.toString();
    }
}
//        System.out.printf("%s\n", p.getPersonName());
//        System.out.printf("Company:\n%s %s %.2f\n",
//                p.getCompany().getCompanyName(), p.getCompany().getDepartment(), p.getCompany().getSalary());
//        System.out.printf("Car:\n%s %d\n", p.getCar().getCarModel(), p.getCar().getCarSpeed());
//
//        System.out.println("Pokemon:");
//        p.getPokemons().forEach(el -> System.out.printf("%s %s\n", el.getPokemonName(), el.getPokemonType()));
//
//        System.out.println("Parents:");
//        p.getParents().forEach(el -> System.out.printf("%s %s\n", el.getParentName(), el.getParentBirthday()));
//
//        System.out.println("Children:");
//        p.getChildren().forEach(el -> System.out.printf("%s %s\n", el.getChildName(), el.getChildBirthday()));
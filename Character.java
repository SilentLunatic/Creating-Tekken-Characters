package tekken;

public class Character 
{
    private String name;
    private int health;
    private int attack;
    private int deffense;
    
    public Character(String name, int health, int attack, int deffense)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.deffense = deffense;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHealth()
    {
        return health;
    }
    
        public int getAttack()
    {
        return attack;
    }
    
        public int getDeffense()
    {
        return deffense;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHealth(int newHealth)
    {
        this.health = health + newHealth;
    }
}

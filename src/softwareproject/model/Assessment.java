package softwareproject.model;

public abstract class Assessment {
    private boolean isSummative;
    private boolean isOnline;
    private int weight;

    public Assessment(boolean isSummative, boolean isOnline, int weight) {
        this.isSummative = isSummative;
        this.isOnline = isOnline;
        this.weight = weight;
    }
    
    

    public boolean isIsSummative() {
        return isSummative;
    }

    public void setIsSummative(boolean isSummative) {
        this.isSummative = isSummative;
    }

    public boolean isIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
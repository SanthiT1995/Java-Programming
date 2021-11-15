public class test {

    //fields (or instance variable)
    String flowername;
    int rosetypecount;
     int rosetypecost;

    public  void set (String name,int typecost,int rosecount)
    {
        this.flowername=name;
       this.rosetypecost=typecost;
        this.rosetypecount=rosecount;

    }
    public int getCost ()
    {

        return this.rosetypecost*this.rosetypecount;
    }



}



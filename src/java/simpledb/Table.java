package simpledb;

class Table{
    public Table(DbFile file, String name, String pkeyField){
        this.file = file;
        this.name = name;
        this.pkeyField = pkeyField;
    }
    public DbFile file;
    public String name;
    public String pkeyField;
}
package entity;

public class Todolist {

    private String todo;

    public Todolist() { // constructor tanpa parameter
    }

    public Todolist(String todo) { // constructor terdapat parameter
        this.todo = todo;
    }

    public String getTodo() { // menambah data
        return todo;
    }

    public void setTodo(String todo) { // mengubah data
        this.todo = todo;
    }
}

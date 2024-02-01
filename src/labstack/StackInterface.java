/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package labstack;

/**
 *
 * @author eoin0
 */
public interface StackInterface {
    public void push(Object newItem);
    public Object pop();
    public Object peek();
    public boolean isEmpty();
    public int size();
    public String display();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter19;

/**
 *
 * @author Students
 */
public class OperationImpl implements Operation<Integer> {

    public Integer add(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum; 

    }
    public Integer factorial(Integer num){
    int f = 1; 
    for (int i =1; i<num; i++){
    f*=1; 
    
    }
    return 
    }
}

package inheritproject;

import javax.swing.JOptionPane;

public class Engineer extends Employee{
    private String skills[]=new String [5];   //skills陣列長度5
    private int skillCount=0;
    public void addSkill(String skill)
        {
        if(skillCount<5)
            skills[skillCount++]=skill;
        else
            JOptionPane.showMessageDialog(null,"技能最多添加五項","錯誤",JOptionPane.ERROR_MESSAGE);
        }
    public Engineer (String name,String ssn,double salary)
        {
        super(name,ssn,salary);  //呼叫爸爸的3個參數丟進來
        }
    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("擁有的特殊技能");
        for(String s:skills)
            {
            //如果陣列內不是null即列出技能
            if(s!=null)
                System.out.println(s+"\t");
            }
        }
    public static void main(String[] args) 
    {

    }
}

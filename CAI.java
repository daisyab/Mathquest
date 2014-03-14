import java.util.Random;
import java.util.Scanner;

public class CAI
{
    private static final Random randomNumbers = new Random();
    
    public static void main(String[] args)
    {      
        int answer = 0, cnt = 0, cnt1 = 0, cnt2 = 0, number1, number2; 
        double a = 0.0;

        System.out.printf("\n\nEnter the your option you would like to carry out:\n");
        System.out.printf("1 Addition.\n2 Substraction.\n3 Multiplication.\n4 Division.\n\n");

        Scanner input = new Scanner(System.in);
        int chose = input.nextInt();

        switch(chose)
        {
            case 1:
                System.out.printf("Enter a number to indicate the difficulty level\n");
                System.out.printf("1 Easy\n2 Medium\n3 Hard\n\n");           

                int choose = input.nextInt();
                switch(choose)
                {
            
                    case 1:

                    while (cnt < 10)
                    {  
                        number1 = randomNumbers.nextInt(10);
                        number2 = randomNumbers.nextInt(10); 

                        System.out.printf("What is %d + %d?\n", number1, number2);
                        int answer1 = number1 + number2;

                        answer = input.nextInt();
                        cnt++;
                                     
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }  
                    }                
                    break;

                    case 2:
    
                    while (cnt < 10)
                    {  
                        number1 = 10 + randomNumbers.nextInt(99);
                        number2 = 10 + randomNumbers.nextInt(99);   

                        System.out.printf("What is %d + %d?\n", number1, number2);
                        int answer1 = number1 + number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }
                    }            
                    break;

                    case 3:
                    while (cnt < 10)
                    {  
                        number1 = 100 + randomNumbers.nextInt(999);
                        number2 = 100 + randomNumbers.nextInt(999);  
            
                        System.out.printf("What is %d + %d?\n", number1, number2);
                        int answer1 = number1 + number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        } 
                    }            
                    break;

                    default:
                        System.out.printf("Enter the correct option.");
                }

        case 2:
                System.out.printf("Enter a number to indicate the difficulty level\n");
                System.out.printf("1 Easy\n2 Medium\n3 Hard\n\n");           

                choose = input.nextInt();
                switch(choose)
                {
            
                    case 1:
                    while (cnt < 10)
                    {  
                        number1 = randomNumbers.nextInt(10);
                        number2 = randomNumbers.nextInt(10); 

                        System.out.printf("What is %d - %d?\n", number1, number2);
                        int answer1 = number1 - number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }  
                    }             
                    break;

                    case 2:    
                    while (cnt < 10)
                    {  
                        number1 = 10 + randomNumbers.nextInt(99);
                        number2 = 10 + randomNumbers.nextInt(99);   

                        System.out.printf("What is %d - %d?\n", number1, number2);
                        int answer1 = number1 - number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }
                    }            
                    break;

                    case 3:
                    while (cnt < 10)
                    {  
                        number1 = 100 + randomNumbers.nextInt(999);
                        number2 = 100 + randomNumbers.nextInt(999);  
            
                        System.out.printf("What is %d - %d?\n", number1, number2);
                        int answer1 = number1 - number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        } 
                    }            
                    break;

                    default:
                        System.out.printf("Enter the correct option.");
        
                }
        case 3:
                System.out.printf("Enter a number to indicate the difficulty level\n");
                System.out.printf("1 Easy\n2 Medium\n3 Hard\n\n");           

                choose = input.nextInt();
                switch(choose)
                {            
                    case 1: 
                    while (cnt < 10)
                    {  
                        number1 = randomNumbers.nextInt(10);
                        number2 = randomNumbers.nextInt(10); 

                        System.out.printf("What is %d * %d?\n", number1, number2);
                        int answer1 = number1 * number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }  
                    }             
                    break;

                    case 2:    
                    while (cnt < 10)
                    {  
                        number1 = 10 + randomNumbers.nextInt(99);
                        number2 = 10 + randomNumbers.nextInt(99);   

                        System.out.printf("What is %d * %d?\n", number1, number2);
                        int answer1 = number1 * number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }
                    }            
                    break;

                    case 3:
                    while (cnt < 10)
                    {  
                        number1 = 100 + randomNumbers.nextInt(999);
                        number2 = 100 + randomNumbers.nextInt(999);  
            
                        System.out.printf("What is %d * %d?\n", number1, number2);
                        int answer1 = number1 * number2;

                        answer = input.nextInt();
                        cnt++;
                                             
                        if(answer1 == answer)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        } 
                    }            
                    break;

                    default:
                        System.out.printf("Enter the correct option.");
                }           

        case 4:
                System.out.printf("Enter a number to indicate the difficulty level\n");
                System.out.printf("1 Easy\n2 Medium\n3 Hard\n\n");           

                choose = input.nextInt();
                switch(choose)
                {
            
                    case 1:
                    while (cnt < 10) 
                    {  
                        number1 = randomNumbers.nextInt(10);
                        number2 = 1 + randomNumbers.nextInt(9); 

                        System.out.printf("What is %d / %d?\n", number1, number2);
                        float answer11 = number1 / number2;

                        float answer1 = input.nextInt();
                        cnt++;
                                             
                        if(answer11 == answer1)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }  
                    }             
                    break;

                    case 2:    
                        while (cnt < 10)
                        {  
                        number1 = 10 + randomNumbers.nextInt(99);
                        number2 = 10 + randomNumbers.nextInt(99);   

                        System.out.printf("What is %d / %d?\n", number1, number2);
                        float answer11 = number1 / number2;

                        float answer1 = input.nextInt();
                        cnt++;
                                             
                        if(answer11 == answer1)
                        {      
                            cnt1++;            
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comment(number3);
                        }
                        
                        else
                        {   
                            cnt2++;                                    
                            int number3 = 1 + randomNumbers.nextInt(4);
                            comments(number3);
                        }
                    }            
                    break;

                    case 3:
                        while (cnt < 10)
                        {  
                            number1 = 100 + randomNumbers.nextInt(999);
                            number2 = 100 + randomNumbers.nextInt(999);  
                
                            System.out.printf("What is %d / %d?\n", number1, number2);
                            float answer11 = number1 / number2;

                            float answer1 = input.nextInt();
                            cnt++;
                                                 
                            if(answer11 == answer1)
                            {      
                                cnt1++;            
                                int number3 = 1 + randomNumbers.nextInt(4);
                                comment(number3);
                            }
                            
                            else
                            {   
                                cnt2++;                                    
                                int number3 = 1 + randomNumbers.nextInt(4);
                                comments(number3);
                            } 
                        }            
                        break;

                        default:
                            System.out.printf("Enter the correct option.");
                    }   
            default:
                System.out.println("Enter the correct option.");
        }

        System.out.printf("Correct answers: %3d\nIncorrect answers: %d\n", cnt1, cnt2);
        a = (cnt1 *10.0);

        if(a < 75.0)
            System.out.printf("%s%.0f%s\n", "You have ", a, "% of the answers correct.\n Please ask your teacher for extra help.");
        else
            System.out.printf("Congratulations. You are ready to go to the next level.\n");
    
    }
                    
    public static void comment(int x)
    {
        switch(x)
        {
            case 1: 
                System.out.println("Very good!");
            break;
            case 2:
                System.out.println("Exellent!");
            break;
            case 3:
                System.out.println("Nice work!");
            break;
            case 4:
                System.out.println("Keep up the good work!");
        }
    }

    public static void comments (int x)
    {
        switch(x)
        {
            case 1: 
                System.out.println("No. Please try again.");
            break;
            case 2:
                System.out.println("Wrong. Try once more.");
            break;
            case 3:
                System.out.println("Don't give up!");
            break;
            case 4:
                System.out.println("No. Keep trying");
            break;
        }
    }
}

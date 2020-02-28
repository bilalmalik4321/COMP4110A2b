package assn2swtest;

public class trigFunc {

	int ans=0;
	boolean step=false;
	
	
		
		public int Sin(int val) {
			
			
			for(int i=1;i<100;i+=2) {
				
				if(step==false) {
					ans+=Math.pow(val,i)/fact(i);
					step=true;
				}
				
				if(step==true) {
					ans-=(Math.pow(val,i))/fact(i);
					step=false;
				}
				
			}
			
			return ans;
		}
		
		
		
		public int Cos(int val) {
			ans=1;
			
			for(int i=2;i<100;i+=2) {
				
				if(step==false) {
					ans+=Math.pow(val,i)/fact(i);
					step=true;
				}
				
				if(step==true) {
					ans-=(Math.pow(val,i))/fact(i);
					step=false;
				}
				
			}
			
			return ans;
			
		}

		public int Tan(int val) {
			
			
			ans=Sin(val)/Cos(val);
			return ans;
			
			
		}

		
	
	
	int fact(int number) {
		 int i,fact=1;  
		 
		 if(number==0) {
			 return 1;
		 }
		      
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }
		  
		  return fact;
	}
}

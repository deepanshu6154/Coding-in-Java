
// Q1. Build LinkedList

// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         System.out.println("Node obj instantiated");
//         this.data = data;
//     }

//     Node(int data , Node next){
//         this(data) ;
//         this.next = next;
//     }
// }
// class LinkedList{
//     private Node head , tail;
//     private int size;

//     LinkedList(){
//         System.out.println("LinkedList obj instantiated");
//         head = tail = null;
//         size = 0;
//     }

//     public void addLast(int val){
//         Node temp = new Node(val,null);
//         if(size==0)
//         {
//             head=tail=temp;
//         }
//         else{
//             tail.next = temp;
//             tail = temp;
//         }
//         size++;
        
//     }

//     public void addFirst(int val){
        
//         if(size==0)
//         {
//            addLast(val); 
//         }
//         else
//         {
//             Node temp = new Node(val,head);
//             head = temp;
//             size++;
//         }
        
//     }

//     public void addAt(int idx,int val){
        
//         if(idx<0 || idx>=size)
//         {
//             System.out.println("Invalid args");
//             return;
//         }
//         else if(idx==0)
//         {
//             addFirst(val);
//         }
//         else if(idx==size-1)
//         {
//             addLast(val);
//         }
//         else
//         {
//             Node node = new Node(val,null);
//             Node temp = head;
//             for(int i=0;i<idx-1;i++)
//             {
//                 temp = temp.next;
//             }
//             node.next = temp.next;
//             temp.next = node;
//             size++;
//         }
//     }

//     public void removeFirst(){
//         if(size==0)
//         {
//             System.out.println("List is empty");
//             return;
//         }
//         else{
//             Node temp = head;
//             head = head.next;
//             temp.next = null;
//             size--;
//         }
        
//     }

//     public void removeLast(){
        
//         if(size==0)
//         {
//             System.out.println("List is empty");
//             return;
//         }
//         else if(size==1)
//         {
//             removeFirst();
//         }
//         else
//         {
//             Node temp=head;
//             for(int i=0;i<size-2;i++)
//             {
//                 temp = temp.next;
//             }
//             temp.next = null;
//             tail = temp;
//             size--;
//         }
//     }

//     public void removeAt(int idx){
       
//         if(idx<0 || idx>=size)
//         {
//             System.out.println("Invalid args");
//             return;
//         }
//         else if(idx==0)
//         {
//             removeFirst();
//         }
//         else if(idx==size-1)
//         {
//             removeLast();
//         }
//         else
//         {
//             Node temp = head;
//             for(int i=0;i<idx-1;i++)
//             {
//                 temp=temp.next;
//             }
//             temp.next = temp.next.next;
//             size--;
//         }
//     }

//     public void display(){
//         for(Node temp=head;temp!=null;temp=temp.next)
//         {
//             System.out.print(temp.data+" -> ");
//         }
//         System.out.print(".");
//         System.out.println();
//     }

//     public int size(){
//         return this.size;
//     }

//     public int getFirst(){
//        if(size==0)
//        {
//            System.out.println("List is empty");
//            return -1;
//        }
//         else
//         {
//             return head.data;
//         }
       
//     }

//     public int getLast(){
//        if(size==0)
//        {
//            System.out.println("List is empty");
//            return -1;
//        }
//         else
//         {
//             return tail.data;
//         }
//     }

//     public int getAt(int idx){
//        if(idx<0 || idx>=size)
//        {
//            System.out.println("Invalid args");
//            return -1;
//        }
//         else if(idx==0)
//         {
//             return getFirst();
//         }
//         else if(idx==size-1)
//         {
//             return getLast();
//         }
//         else
//         {
//             Node temp = head;
//             for(int i=0;i<idx;i++)
//             {
//                 temp=temp.next;
//             }
//             return temp.data;
//         }
//     }

// }

// public class Main{
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();
//         while(!str.equals("quit!")){
//             String parts[] = str.split(" ");

//             switch(parts[0]){
//                 case "addAt" : {
//                     System.out.println("addAt cmd"+parts[1]+"-->"+parts[2]);
//                     list.addAt(Integer.parseInt(parts[1]) , Integer.parseInt(parts[2]));
//                 }break;
//                 case "addFirst" : {
//                     System.out.println("addFirst cmd"+parts[1]);
//                     list.addFirst(Integer.parseInt(parts[1]));
//                 }break;
//                 case "addLast" : {
//                     System.out.println("addLast cmd"+parts[1]);
//                     list.addLast(Integer.parseInt(parts[1]));
//                 }break;
//                 case "getFirst" : {
//                     System.out.println("getFirst cmd");
//                     System.out.println(list.getFirst());
//                 }break;
//                 case "getAt" : {
//                     System.out.println("getAt cmd"+parts[1]);
//                     System.out.println(list.getAt(Integer.parseInt(parts[1])));
//                 }break;
//                 case "getLast" : {
//                     System.out.println("getLast cmd");
//                     System.out.println(list.getLast());
//                 }break;
//                 case "removeFirst" : {
//                     System.out.println("remove first");
//                     System.out.println(list.getFirst());
//                     list.removeFirst();
//                 }break;
//                 case "removeLast" : {
//                     System.out.println("remove last");
//                     System.out.println(list.getLast());
//                     list.removeLast();
//                 }break;
//                 case "removeAt" : {
//                     System.out.println("remove at" + parts[1]);
//                     System.out.println(list.getAt(Integer.parseInt(parts[1])));
//                     list.removeAt(Integer.parseInt(parts[1]));
//                 }break;
//                 case "size" : {
//                     System.out.println("size : "+list.size());
//                 }break;
//                 case "display" : {
//                     System.out.println("display : ");
//                     list.display();
//                 }break;
//             }
//             str = scn.nextLine();
//         }

//     }
// }

// Q2. Infix Problem


// public class Main{
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String exp = scn.nextLine();
//         infixEvaluation(exp);
//         infixConversion(exp);
//     }
    
    
//     public static void infixEvaluation(String exp)
//     {
//         Stack<Integer> operands = new Stack<>();
//         Stack<Character> operators = new Stack<>();

//         for (int i = 0; i < exp.length(); i++) {
//              char ch = exp.charAt(i);

//           if (ch == '(') {
//             operators.push(ch);
//           } else if (Character.isDigit(ch)) {
//             operands.push(ch - '0');
//           } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//             while (operators.size() > 0 && operators.peek() != '(' && 
//                    precedence(ch) <= precedence(operators.peek())) {
//               int val2 = operands.pop();
//               int val1 = operands.pop();
//               char op = operators.pop();

//               int opval = operation(val1, val2, op);
//               operands.push(opval);
//             }

//         operators.push(ch);
//       } else if (ch == ')') {
//         while (operators.size() > 0 && operators.peek() != '(') {
//           int val2 = operands.pop();
//           int val1 = operands.pop();
//           char op = operators.pop();

//           int opval = operation(val1, val2, op);
//           operands.push(opval);
//         }

//         if (operators.size() > 0) {
//           operators.pop();
//         }
//       }
//     }

//     while (operators.size() > 0) {
//       int val2 = operands.pop();
//       int val1 = operands.pop();
//       char op = operators.pop();

//       int opval = operation(val1, val2, op);
//       operands.push(opval);
//     }

//         int val = operands.pop();
//         System.out.println(val);
//     }
    

//     public static void infixConversion(String exp)
//     {
//         Stack<String> postfix = new Stack<>();
//     Stack<String> prefix = new Stack<>();
//     Stack<Character> operators = new Stack<>();

//     for (int i = 0; i < exp.length(); i++) {
//       char ch = exp.charAt(i);

//       if (ch == '(') {
//         operators.push(ch);
//       } else if ((ch >='0' && ch <= '9') || (ch >='a' && ch <= 'z') || (ch >='A' && ch <= 'Z'))  {
//         postfix.push(ch + "");
//         prefix.push(ch + "");
//       } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//         while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
//           char op = operators.pop();

//           String postval2 = postfix.pop();
//           String postval1 = postfix.pop();
//           postfix.push(postval1 + postval2 + op);

//           String preval2 = prefix.pop();
//           String preval1 = prefix.pop();
//           prefix.push(op + preval1 + preval2);
//         }

//         operators.push(ch);
//       } else if (ch == ')') {
//         while (operators.size() > 0 && operators.peek() != '(') {
//           char op = operators.pop();

//           String postval2 = postfix.pop();
//           String postval1 = postfix.pop();
//           postfix.push(postval1 + postval2 + op);

//           String preval2 = prefix.pop();
//           String preval1 = prefix.pop();
//           prefix.push(op + preval1 + preval2);
//         }

//         if (operators.size() > 0) {
//           operators.pop();
//         }
//       }
//     }

//     while (operators.size() > 0) {
//       char op = operators.pop();

//       String postval2 = postfix.pop();
//       String postval1 = postfix.pop();
//       postfix.push(postval1 + postval2 + op);

//       String preval2 = prefix.pop();
//       String preval1 = prefix.pop();
//       prefix.push(op + preval1 + preval2);
//     }

//     System.out.println(postfix.peek());
//     System.out.println(prefix.peek());
 
//     }

//   public static int precedence(char op){
//     if(op == '+'){
//       return 1;
//     } else if(op == '-'){
//       return 1;
//     } else if(op == '*'){
//       return 2;
//     } else {
//       return 2;
//     }
//   }

//   public static int operation(int val1, int val2, char op){
//     if(op == '+'){
//       return val1 + val2;
//     } else if(op == '-'){
//       return val1 - val2;
//     } else if(op == '*'){
//       return val1 * val2;
//     } else {
//       return val1 / val2;
//     }
 
// }
// }

// Q3.Maximal Area


// public class Main {

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     int n = Integer.parseInt(br.readLine());
//     int[] arr = new int[n];
//     for (int i = 0; i < n; i++) {
//       arr[i] = Integer.parseInt(br.readLine());
//     }

//     int[] rb = new int[arr.length]; // nse on the right
//     Stack<Integer> st = new Stack<>();

//     st.push(arr.length - 1);
//     rb[arr.length - 1] = arr.length;
//     for (int i = arr.length - 2; i >= 0; i--) {
//       while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
//         st.pop();
//       }

//       if (st.size() == 0) {
//         rb[i] = arr.length;
//       } else {
//         rb[i] = st.peek();
//       }

//       st.push(i);
//     }
    
//       display(rb);               // display nse on right
      
//     int[] lb = new int[arr.length]; // nse on the left
//     st = new Stack<>();

//     st.push(0);
//     lb[0] = -1;
//     for (int i = 1; i < arr.length; i++) {
//       while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
//         st.pop();
//       }

//       if (st.size() == 0) {
//         lb[i] = -1;
//       } else {
//         lb[i] = st.peek();
//       }

//       st.push(i);
//     }
    
//       display(lb);                //display nse on right
      
//     int max = 0;
//     for (int i = 0; i < arr.length; i++) {
//       int width = rb[i] - lb[i] - 1;
//       int area = width * arr[i];
//       if (area > max) {
//         max = area;
//       }
//     }

//     System.out.println(max);
//   }
    
//     public static void display(int[] arr)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }

// Q4. Windows Conundrum

// public class Main{
  

// public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int[] arr = new int[n];
//     for(int i = 0; i < n; i++){
//        arr[i] = scn.nextInt();
//     }
//     int k = scn.nextInt();

//     int[] nge = new int[arr.length];

//     Stack<Integer> st = new Stack<>();
//     st.push(arr.length - 1);
//     nge[arr.length - 1] = arr.length;

//     for(int i = arr.length - 2; i >= 0; i--){
//       while(st.size() > 0 && arr[i] >= arr[st.peek()]){
//         st.pop();
//       }

//       if(st.size() == 0){
//         nge[i] = arr.length;
//       } else {
//         nge[i] = st.peek();
//       }

//       st.push(i);
//     }

//     int j = 0;
//     for(int i = 0; i <= arr.length - k; i++){
//       if(j < i){
//         j = i;
//       }

//       while(nge[j] < i + k){
//         j = nge[j];
//       }
//       System.out.println(arr[j]);
//     }
//  }
// }
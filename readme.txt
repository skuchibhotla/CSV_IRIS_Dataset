README
DB-Project2

>> I. Team Information

1. Shashank Srivatsa Kuchibhotla (skuchibhotla)


>> II. Program compilation

Type <javac IrisDataProjectDemo.java> (without the < > symbols) in the command line and press ENTER to compile the program.  

skuchibhotla@loki:~/DB-Project2$ javac IrisDataProjectDemo.java


>> III. Program execution and Output Description

Once Program compilation is done, type <java IrisDataProjectDemo> (without the < > symbols) in the command line and press ENTER to get the output. 

skuchibhotla@loki:~/DB-Project2$ java IrisDataProjectDemo

1. The Output will have the UnSorted List first. The UnSorted List contains the Iris Data in an unsorted manner. 
2. Then, the same list is printed with the contents sorted in ascending order. 
3. After that, the values to be searched in the IRIS Data are searched and the results are printed on the screen.
4. Like in the output below, the values to be searched in the IRIS Data (stored in the values.txt file) are searched and the respective results are displayed.

Values in the values.txt are 5.1,7.0,2.8,-1.0. 

We can see that:

5.1 is located at position 1 in the UnSorted List.     
7.0 is located at position 51 in the UnSorted List.
2.8 is not present in the UnSorted List. Therefore, the number of objects accessed is 150 (the complete list). 
-1.0 is not present in the UnSorted List. Therefore, the number of objects accessed is 150 (the complete list).

5.1 is located at position 33 in the UnSorted List.     
7.0 is located at position 138 in the UnSorted List.
2.8 is not present in the UnSorted List. Therefore, the number of objects accessed is 1. This is because the first element; 4.3 is greater than 2.8. Thus, we can be sure that 2.8 will not be there in the list as the list is sorted.
-1.0 is not present in the UnSorted List. Therefore, the number of objects accessed is 1. This is because the first element; 4.3 is greater than -1.0. Thus, we can be sure that -1.0 will not be there in the list as the list is sorted.

The average no. of objects accessed in both the UnSOrted List and Sorted List are then printed.
In our program, the average objects accessed in UnSorted List are: 88.0.
//(1 + 51 + 150 + 150)/4 => (352/4) => 88.0

The average objects accessed in the Sorted List are: 43.25. 
//(33 + 138 + 1 + 1)/4 => (173/4) => 43.25


Output:

Done


UnSorted List is:
[Iris-setosa:5.1, Iris-setosa:4.9, Iris-setosa:4.7, Iris-setosa:4.6, Iris-setosa:5.0, Iris-setosa:5.4, Iris-setosa:4.6, Iris-setosa:5.0, Iris-setosa:4.4, Iris-setosa:4.9, Iris-setosa:5.4, Iris-setosa:4.8, Iris-setosa:4.8, Iris-setosa:4.3, Iris-setosa:5.8, Iris-setosa:5.7, Iris-setosa:5.4, Iris-setosa:5.1, Iris-setosa:5.7, Iris-setosa:5.1, Iris-setosa:5.4, Iris-setosa:5.1, Iris-setosa:4.6, Iris-setosa:5.1, Iris-setosa:4.8, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.2, Iris-setosa:5.2, Iris-setosa:4.7, Iris-setosa:4.8, Iris-setosa:5.4, Iris-setosa:5.2, Iris-setosa:5.5, Iris-setosa:4.9, Iris-setosa:5.0, Iris-setosa:5.5, Iris-setosa:4.9, Iris-setosa:4.4, Iris-setosa:5.1, Iris-setosa:5.0, Iris-setosa:4.5, Iris-setosa:4.4, Iris-setosa:5.0, Iris-setosa:5.1, Iris-setosa:4.8, Iris-setosa:5.1, Iris-setosa:4.6, Iris-setosa:5.3, Iris-setosa:5.0, Iris-versicolor:7.0, Iris-versicolor:6.4, Iris-versicolor:6.9, Iris-versicolor:5.5, Iris-versicolor:6.5, Iris-versicolor:5.7, Iris-versicolor:6.3, Iris-versicolor:4.9, Iris-versicolor:6.6, Iris-versicolor:5.2, Iris-versicolor:5.0, Iris-versicolor:5.9, Iris-versicolor:6.0, Iris-versicolor:6.1, Iris-versicolor:5.6, Iris-versicolor:6.7, Iris-versicolor:5.6, Iris-versicolor:5.8, Iris-versicolor:6.2, Iris-versicolor:5.6, Iris-versicolor:5.9, Iris-versicolor:6.1, Iris-versicolor:6.3, Iris-versicolor:6.1, Iris-versicolor:6.4, Iris-versicolor:6.6, Iris-versicolor:6.8, Iris-versicolor:6.7, Iris-versicolor:6.0, Iris-versicolor:5.7, Iris-versicolor:5.5, Iris-versicolor:5.5, Iris-versicolor:5.8, Iris-versicolor:6.0, Iris-versicolor:5.4, Iris-versicolor:6.0, Iris-versicolor:6.7, Iris-versicolor:6.3, Iris-versicolor:5.6, Iris-versicolor:5.5, Iris-versicolor:5.5, Iris-versicolor:6.1, Iris-versicolor:5.8, Iris-versicolor:5.0, Iris-versicolor:5.6, Iris-versicolor:5.7, Iris-versicolor:5.7, Iris-versicolor:6.2, Iris-versicolor:5.1, Iris-versicolor:5.7, Iris-virginica:6.3, Iris-virginica:5.8, Iris-virginica:7.1, Iris-virginica:6.3, Iris-virginica:6.5, Iris-virginica:7.6, Iris-virginica:4.9, Iris-virginica:7.3, Iris-virginica:6.7, Iris-virginica:7.2, Iris-virginica:6.5, Iris-virginica:6.4, Iris-virginica:6.8, Iris-virginica:5.7, Iris-virginica:5.8, Iris-virginica:6.4, Iris-virginica:6.5, Iris-virginica:7.7, Iris-virginica:7.7, Iris-virginica:6.0, Iris-virginica:6.9, Iris-virginica:5.6, Iris-virginica:7.7, Iris-virginica:6.3, Iris-virginica:6.7, Iris-virginica:7.2, Iris-virginica:6.2, Iris-virginica:6.1, Iris-virginica:6.4, Iris-virginica:7.2, Iris-virginica:7.4, Iris-virginica:7.9, Iris-virginica:6.4, Iris-virginica:6.3, Iris-virginica:6.1, Iris-virginica:7.7, Iris-virginica:6.3, Iris-virginica:6.4, Iris-virginica:6.0, Iris-virginica:6.9, Iris-virginica:6.7, Iris-virginica:6.9, Iris-virginica:5.8, Iris-virginica:6.8, Iris-virginica:6.7, Iris-virginica:6.7, Iris-virginica:6.3, Iris-virginica:6.5, Iris-virginica:6.2, Iris-virginica:5.9]


Sorted List is:
[Iris-setosa:4.3, Iris-setosa:4.4, Iris-setosa:4.4, Iris-setosa:4.4, Iris-setosa:4.5, Iris-setosa:4.6, Iris-setosa:4.6, Iris-setosa:4.6, Iris-setosa:4.6, Iris-setosa:4.7, Iris-setosa:4.7, Iris-setosa:4.8, Iris-setosa:4.8, Iris-setosa:4.8, Iris-setosa:4.8, Iris-setosa:4.8, Iris-setosa:4.9, Iris-setosa:4.9, Iris-setosa:4.9, Iris-setosa:4.9, Iris-versicolor:4.9, Iris-virginica:4.9, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.0, Iris-setosa:5.0, Iris-versicolor:5.0, Iris-versicolor:5.0, Iris-setosa:5.1, Iris-setosa:5.1, Iris-setosa:5.1, Iris-setosa:5.1, Iris-setosa:5.1, Iris-setosa:5.1, Iris-setosa:5.1, Iris-setosa:5.1, Iris-versicolor:5.1, Iris-setosa:5.2, Iris-setosa:5.2, Iris-setosa:5.2, Iris-versicolor:5.2, Iris-setosa:5.3, Iris-setosa:5.4, Iris-setosa:5.4, Iris-setosa:5.4, Iris-setosa:5.4, Iris-setosa:5.4, Iris-versicolor:5.4, Iris-setosa:5.5, Iris-setosa:5.5, Iris-versicolor:5.5, Iris-versicolor:5.5, Iris-versicolor:5.5, Iris-versicolor:5.5, Iris-versicolor:5.5, Iris-versicolor:5.6, Iris-versicolor:5.6, Iris-versicolor:5.6, Iris-versicolor:5.6, Iris-versicolor:5.6, Iris-virginica:5.6, Iris-setosa:5.7, Iris-setosa:5.7, Iris-versicolor:5.7, Iris-versicolor:5.7, Iris-versicolor:5.7, Iris-versicolor:5.7, Iris-versicolor:5.7, Iris-virginica:5.7, Iris-setosa:5.8, Iris-versicolor:5.8, Iris-versicolor:5.8, Iris-versicolor:5.8, Iris-virginica:5.8, Iris-virginica:5.8, Iris-virginica:5.8, Iris-versicolor:5.9, Iris-versicolor:5.9, Iris-virginica:5.9, Iris-versicolor:6.0, Iris-versicolor:6.0, Iris-versicolor:6.0, Iris-versicolor:6.0, Iris-virginica:6.0, Iris-virginica:6.0, Iris-versicolor:6.1, Iris-versicolor:6.1, Iris-versicolor:6.1, Iris-versicolor:6.1, Iris-virginica:6.1, Iris-virginica:6.1, Iris-versicolor:6.2, Iris-versicolor:6.2, Iris-virginica:6.2, Iris-virginica:6.2, Iris-versicolor:6.3, Iris-versicolor:6.3, Iris-versicolor:6.3, Iris-virginica:6.3, Iris-virginica:6.3, Iris-virginica:6.3, Iris-virginica:6.3, Iris-virginica:6.3, Iris-virginica:6.3, Iris-versicolor:6.4, Iris-versicolor:6.4, Iris-virginica:6.4, Iris-virginica:6.4, Iris-virginica:6.4, Iris-virginica:6.4, Iris-virginica:6.4, Iris-versicolor:6.5, Iris-virginica:6.5, Iris-virginica:6.5, Iris-virginica:6.5, Iris-virginica:6.5, Iris-versicolor:6.6, Iris-versicolor:6.6, Iris-versicolor:6.7, Iris-versicolor:6.7, Iris-versicolor:6.7, Iris-virginica:6.7, Iris-virginica:6.7, Iris-virginica:6.7, Iris-virginica:6.7, Iris-virginica:6.7, Iris-versicolor:6.8, Iris-virginica:6.8, Iris-virginica:6.8, Iris-versicolor:6.9, Iris-virginica:6.9, Iris-virginica:6.9, Iris-virginica:6.9, Iris-versicolor:7.0, Iris-virginica:7.1, Iris-virginica:7.2, Iris-virginica:7.2, Iris-virginica:7.2, Iris-virginica:7.3, Iris-virginica:7.4, Iris-virginica:7.6, Iris-virginica:7.7, Iris-virginica:7.7, Iris-virginica:7.7, Iris-virginica:7.7, Iris-virginica:7.9]
Done


No. of objects accessed in UnSorted List for 5.1: 1
No. of objects accessed in Sorted List for 5.1: 33


No. of objects accessed in UnSorted List for 7.0: 51
No. of objects accessed in Sorted List for 7.0: 138


No. of objects accessed in UnSorted List for 2.8: 150
No. of objects accessed in Sorted List for 2.8: 1


No. of objects accessed in UnSorted List for -1.0: 150
No. of objects accessed in Sorted List for -1.0: 1


Average no. of objects accessed in UnSorted List: 88.0
Average no. of objects accessed in Sorted list: 43.25
 
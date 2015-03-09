package com.PACKT.chapter1;

import java.io.*;
import java.util.*;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;

public class Map extends MapReduceBase implements
		Mapper<LongWritable,
				Text,
				Text,
				IntWritable>{
	
	// Defining the map method - for processing the data with
	// problem specific logic
	public void map(LongWritable key, 
					Text value,
					OutputCollector<Text, IntWritable> output,
					Reporter reporter)
					throws IOException {
		// For breaking the string to tokens and convert them to lowercase
		StringTokenizer st = new StringTokenizer(value.toString().toLowerCase());
		
		while(st.hasMoreTokens()){
			
			// Emitting the (key, value) pair with value 1.
			output.collect(new Text(st.nextToken()), new IntWritable(1));
		}
	}
}

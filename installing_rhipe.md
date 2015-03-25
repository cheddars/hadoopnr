## Installing RHIPE ##

### 0. Install R on task tracker node ###

add to /etc/apt/sources.list

	deb http://cran.nexr.com/bin/linux/ubuntu trusty/
	
install r-base

	sudo apt-get update
	sudo apt-get install r-base
	

### 1. Install protobuf ###

https://github.com/google/protobuf

	sudo apt-get install build-essential
	sudo apt-get install autoconf
	sudo apt-get install libtool
	sudo apt-get install pkg-config

	wget http://protobuf.googlecode.com/files/protobuf-2.4.1.tar.gz
	tar xvf protobuf-2.4.1.tar.gz
	cd protobuf-2.4.1
	./autogen.sh
	./configure
	make
	make check
	sudo make install


### 2. Install rJava ###

	sudo apt-get install r-cran-rjava
		
	
### 3. Install RHIPE ###

set env variables in ~/.bashrc

	export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/local/lib
	export PKG_CONFIG_PATH=$PKG_CONFIG_PATH:/usr/local/lib
	
apply changes

	source ~/.bashrc
	
set hadoop env variables in R console

	Sys.setenv(HADOOP_HOME="/usr/local/hadoop/current/")
	Sys.setenv(HADOOP_BIN="/usr/local/hadoop/current/bin")
	Sys.setenv(HADOOP_CONF_DIR="/usr/local/hadoop/current/conf")
	
	
download RHIPE

	wget http://ml.stat.purdue.edu/rhipebin/Rhipe_0.73.1.tar.gz
	R CMD INSTALL Rhipe_0.73.1.tar.gz





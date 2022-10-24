cmake_minimum_required(VERSION 3.22)
project(Clion)

set(CMAKE_CXX_STANDARD 17)
#include_directories()
include_directories(ZeroTrac/header)
aux_source_directory(ZeroTrac/1500_1600 SOURCES1)
aux_source_directory(ZeroTrac/1800_1900 SOURCES2)
aux_source_directory(ZeroTrac/1600_1800 SOURCES3)
aux_source_directory(ZeroTrac/BinarySearch SOURCES4)
aux_source_directory(ZeroTrac/DisjointSet SOURCES5)
aux_source_directory(ZeroTrac/Graph SOURCES6)
aux_source_directory(ZeroTrac/array_list SOURCES7)
aux_source_directory(ZeroTrac/Tree SOURCES8)

add_executable(Clion main.cpp
        ${SOURCES1}
        ${SOURCES2}
        ${SOURCES3}
        ${SOURCES4}
        ${SOURCES5}
        ${SOURCES6}
        ${SOURCES7}
        ${SOURCES8})


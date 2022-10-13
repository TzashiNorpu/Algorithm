cmake_minimum_required(VERSION 3.22)
project(Clion)

set(CMAKE_CXX_STANDARD 17)
#include_directories()
include_directories(ZeroTrac/header)
aux_source_directory(ZeroTrac/1500_1600 SOURCES1)
aux_source_directory(ZeroTrac/1800_1900 SOURCES2)
aux_source_directory(ZeroTrac/1600_1800 SOURCES3)
aux_source_directory(ZeroTrac/BinarySearch SOURCES4)

add_executable(Clion main.cpp
        ${SOURCES1}
        ${SOURCES2}
        ${SOURCES3}
        ${SOURCES4}
        ZeroTrac/1800_1900/longestCycle_2360.cpp ZeroTrac/1800_1900/nthMagicalNumber_878.cpp ZeroTrac/1800_1900/canReach_1871.cpp)


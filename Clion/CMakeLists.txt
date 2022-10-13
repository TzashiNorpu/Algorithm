cmake_minimum_required(VERSION 3.22)
project(Clion)

set(CMAKE_CXX_STANDARD 17)

file(GLOB SOURCES1 ${PROJECT_SOURCE_DIR}/ZeroTrac/1800_1900/*.cpp)
file(GLOB SOURCES2 ${PROJECT_SOURCE_DIR}/ZeroTrac/1600_1800/*.cpp)
file(GLOB SOURCES3 ${PROJECT_SOURCE_DIR}/ZeroTrac/1500_1600/*.cpp)

add_executable(Clion main.cpp ${SOURCES1} ${SOURCES2} ${SOURCES3} ZeroTrac/1800_1900/getBiggestThree_1878.cpp)
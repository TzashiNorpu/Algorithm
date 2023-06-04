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
aux_source_directory(ZeroTrac/DP SOURCES9)
aux_source_directory(ZeroTrac/labuladong SOURCES10)
aux_source_directory(labuladong SOURCES11)
aux_source_directory(zero SOURCES12)

add_executable(Clion main.cpp
        ${SOURCES1}
        ${SOURCES2}
        ${SOURCES3}
        ${SOURCES4}
        ${SOURCES5}
        ${SOURCES6}
        ${SOURCES7}
        ${SOURCES8}
        ${SOURCES9}
        ${SOURCES10}
        ${SOURCES11}
        ${SOURCES12}
        labuladong/chapter0/linklist/removeNthFromEnd_19.cpp labuladong/chapter0/linklist/getKthFromEnd_offer22.cpp labuladong/chapter0/array/twoSum_167.cpp labuladong/chapter0/array/removeDuplicates_26.cpp labuladong/chapter0/binary_tree/maxDepth_104.cpp labuladong/chapter0/binary_tree/preorderTraversal_144.cpp labuladong/chapter0/binary_tree/diameterOfBinaryTree_543.cpp zero/1000_1200/countSeniors_2678.cpp zero/1000_1200/minimumAbsDifference_1200.cpp zero/1000_1200/sumEvenAfterQueries_985.cpp zero/1000_1200/maximumCount_2529.cpp zero/1000_1200/uniqueOccurrences_1207.cpp zero/1000_1200/maximum69Number_1323.cpp zero/1000_1200/kLengthApart_1437.cpp)


#include "TestStructure.h"

MY_STRUCTURE_EXPORT MyStruct getMyStruct() {
    MyStruct result;
    result.Type = 1;
    result.Count = 100;
    result.ClearNeeded = 1;
    return result;
}
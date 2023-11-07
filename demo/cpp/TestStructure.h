#define MY_STRUCTURE_EXPORT __declspec(dllexport)

#ifdef __cplusplus
extern "C" {
#endif

	struct MY_STRUCTURE_EXPORT  MyStruct
	{
		unsigned int Type;
		unsigned int Count;
		unsigned int ClearNeeded;
	};

	MY_STRUCTURE_EXPORT MyStruct getMyStruct();

#ifdef __cplusplus
}
#endif

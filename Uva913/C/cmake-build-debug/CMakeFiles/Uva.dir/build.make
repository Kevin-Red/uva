# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.14

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = C:\software\CLion\bin\cmake\win\bin\cmake.exe

# The command to remove a file.
RM = C:\software\CLion\bin\cmake\win\bin\cmake.exe -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = D:\UVA\Uva913\C

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\UVA\Uva913\C\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Uva.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Uva.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Uva.dir/flags.make

CMakeFiles/Uva.dir/main.cpp.obj: CMakeFiles/Uva.dir/flags.make
CMakeFiles/Uva.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\UVA\Uva913\C\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Uva.dir/main.cpp.obj"
	C:\software\MinGW64\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Uva.dir\main.cpp.obj -c D:\UVA\Uva913\C\main.cpp

CMakeFiles/Uva.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Uva.dir/main.cpp.i"
	C:\software\MinGW64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E D:\UVA\Uva913\C\main.cpp > CMakeFiles\Uva.dir\main.cpp.i

CMakeFiles/Uva.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Uva.dir/main.cpp.s"
	C:\software\MinGW64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S D:\UVA\Uva913\C\main.cpp -o CMakeFiles\Uva.dir\main.cpp.s

# Object files for target Uva
Uva_OBJECTS = \
"CMakeFiles/Uva.dir/main.cpp.obj"

# External object files for target Uva
Uva_EXTERNAL_OBJECTS =

Uva.exe: CMakeFiles/Uva.dir/main.cpp.obj
Uva.exe: CMakeFiles/Uva.dir/build.make
Uva.exe: CMakeFiles/Uva.dir/linklibs.rsp
Uva.exe: CMakeFiles/Uva.dir/objects1.rsp
Uva.exe: CMakeFiles/Uva.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\UVA\Uva913\C\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Uva.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Uva.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Uva.dir/build: Uva.exe

.PHONY : CMakeFiles/Uva.dir/build

CMakeFiles/Uva.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Uva.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Uva.dir/clean

CMakeFiles/Uva.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\UVA\Uva913\C D:\UVA\Uva913\C D:\UVA\Uva913\C\cmake-build-debug D:\UVA\Uva913\C\cmake-build-debug D:\UVA\Uva913\C\cmake-build-debug\CMakeFiles\Uva.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Uva.dir/depend


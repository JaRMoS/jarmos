/**
 * @page jarmos_download Download instructions
 * @short How to get JaRMoS
 * 
 * @section dl_link Direct file download
 * 
 * @section dl_git GIT repository (Source code only)
 * 
 * The probably easiest way to obtain all of JaRMoS is to use the global GIT repository
 * 
 * @code git clone http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JaRMoS <target_directory> @endcode
 * 
 * Therein, all other modules are contained as submodules. Once the main repository is checked out, simply call
 * 
 * @code git submodule update -i \endcode to initialize and fetch the current sub-repositories. @endcode
 * 
 * \note If you want to develop JaRMoS, you should make sure all submodules are on their master branch after fetching.
 * This can be achieved by calling
 * @code git submodule foreach git checkout master @endcode
 * 
 * Alternatively, each of the modules can be downloaded directly using GIT:
 * @li \ref jarmosbase http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JaRMoSBase
 * @li \ref jarmospc http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JaRMoSPC
 * @li \ref jarmosa http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JaRMoSA
 * @li \ref jkermor http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JKerMor
 * @li \ref jrb http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JRB
 * 
 * \page jarmos_setup JaRMoS installation
 * 
 * \section setup_binaries Using binaries
 * 
 * If you downloaded precomplied binaries, follow the instructions below.
 * 
 * @subsection jarmosa_bin JaRMoSA
 * 
 * @subsection jarmospc_bin JaRMoSPC
 * 
 * \section setup_source Installation from source
 * 
 * @subsection jarmosa_src JaRMoSA
 * 
 * @subsection jarmospc_src JaRMoSPC
 */

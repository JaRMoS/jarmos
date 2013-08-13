/**
 * @page jarmos_download Download instructions
 * @short How to get JaRMoS
 * 
 * @section dl_link Direct file download
 * 
 * The following files are available for direct download:
 * \li @ref jarmosa !JARMOSA_VERSION! Android APK: <a href="!JARMOSA_APK!">!JARMOSA_APK!</a>.
 * \li @ref jarmospc !JARMOSA_VERSION! JAR and dependencies: <a href="!JARMOSPC_ZIP!">!JARMOSPC_ZIP!</a>.
 * \li \ref jarmosmodels: <a href="!JARMOS_MODELS_ZIP!">!JARMOS_MODELS_ZIP!</a>
 * \li Complete source: <a href="!JARMOS_SRC_ZIP!">!JARMOS_SRC_ZIP!</a> <a href="!JARMOS_SRC_TAR!">!JARMOS_SRC_TAR!</a>
 * 
 * \note If you select the \ref jarmosa link using your mobile browser, you can (usually) download and install the APK directly on your device.
 * 
 * @section dl_git GIT repository
 * 
 * The probably easiest way to obtain all of JaRMoS !JARMOSA_VERSION! source is to use the global GIT repository
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
 * @li \ref jarmosmodels http://www.ians.uni-stuttgart.de:8080/agh/gitblit/git/software/java/JaRMoSModels
 * 
 * \page jarmos_setup JaRMoS installation
 * 
 * \section setup_binaries Using binaries
 * 
 * If you downloaded precomplied binaries, follow the instructions below.
 * 
 * @subsection jarmosa_bin JaRMoSA
 * 
 * As already mentioned in \ref dl_link, the easiest is to directly use <a href="!JARMOSA_APK!">this link</a> from within your mobile device' browser.
 * 
 * In order to manually install \ref jarmosapp on your mobile device, you need to:
 *  \li Transfer the APK to the device using the method of your choice (e.g. USB cable)
 *  \li Open the stored file using e.g. the ES File Explorer (https://play.google.com/store/apps/details?id=com.estrongs.android.pop&hl=en).
 *  \li Follow the device-dependent procedure to install the APK
 *  \li Run the app!
 *  
 *  Another way is to use the android debug bridge (adb), which is contained in the Android SDK (see \ref jarmosa_src)
 * 
 * @subsection jarmospc_bin JaRMoSPC
 * 
 * The \ref jarmospc binaries come as a \c .zip file containing the main \c .jar package and all required libraries in the folder \c lib/.
 * Extract the archive to a location of your choice, enter the folder using a terminal or \c cmd (Windows) and run
 * \code java -cp libs/* -jar JaRMoSPC-<version>.jar [<model_folder>] \endcode
 *  
 * Note that \c Java needs to be available on your \c PATH. If you omit the <tt><model_folder></tt> argument, a default directory selection dialog will prompt
 * you to select a model directory (See \ref jarmos_models).
 * 
 * \section setup_source Installation from source
 * 
 * Once you have compiled your component, you can follow the instructions \ref setup_binaries.
 * 
 * @subsection jarmosa_src JaRMoSA
 * 
 * In order to build \ref jarmosa yourself, you need
 * \li Java JDK 1.6 or higher: http://www.java.com/en/download/
 * \li Android SDK: http://developer.android.com/sdk/index.html
 * \li Eclipse IDE (optional): http://www.eclipse.org/downloads/
 * \li Ant (if no Eclipse is used): http://ant.apache.org/
 * 
 * If you dont want to use Eclipse, you will need Ant in order to build JaRMoS components.
 * 
 * \subsubsection jarmosa_src_eclipse Building with Eclipse
 * 
 * After download of the sources, you can use the import feature of Eclipse to create the projects within Eclipse.
 * Once all projects are imported, you need to configure the build path:
 * \li For all projects, the \c .classpath file should be detected and used by Eclipse in order to establish links and dependencies for building.
 * If that does not work, the respective \c .jar libraries are contained in the \c lib/ folders of the projects, and JUnit can be found in the JaRMoS root directory under \c lib/.
 * Jar files can also be referenced over different projects.
 * \li For \ref jarmosa, additionally the "Order and Export" options (<tt>Properties -> Java Build Path -> Order and Export</tt>) have to be ticked for all referenced jar files.
 * Otherwise the app will crash due to missing classes.
 * 
 * Now you can connect your android device, make sure it works with \c adb via
 * \code adb devices \endcode
 * and run the application e.g. via right-click on the <tt>JaRMoSA-project -> Run as -> Android Application</tt>.
 * 
 * \subsubsection jarmosa_src_ant Building with Ant
 * 
 * Simply open a terminal/console/command with the \c ant binary available on the path, change into the JaRMoS root folder and type
 * \code ant <target> \endcode
 * If you dont specify a target and just call \c ant, everything will be built. The possible targets are
 * \li \b all: builds all components including source zips and documentation
 * \li \b src: Creates the source \c .zip and \c .tar.gz files
 * \li \b jarmosa: Builds the \ref jarmosa APK in \c JaRMoSA/bin/
 * \li \b jarmospc: Creates a \ref jarmospc \c .zip file containing <tt>JaRMoSPC-<version>.jar</tt> and dependencies
 * \li \b docs: Creates the documentation. Can be run without previously running any other target, however, compiling \b jarmosa and \b jarmospc will have it correctly including the download files in the documentation.
 * 
 * @subsection jarmospc_src JaRMoSPC
 * 
 * Once the build path is configured correctly (which should be done automatically as within-workspace references are included in the \c .classpath files),
 * simply use the Eclipse built-in <tt>Run configurations</tt> and select <tt>Run as... -> Java Application</tt> on \c jarmos.pc.Main.
 */

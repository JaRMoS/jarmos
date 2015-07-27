/**
 * @mainpage Welcome to JaRMoS!
 * 
 * JaRMoS stands for "Java Reduced Model Simulations" and aims to enable import and simulation of
 * various reduced models from multiple sources on any java-capable platform.
 * 
 * So far support for <a href="http://www.morepas.org/software/rbmatlab">rbmatlab</a>,
 * <a href="http://www.morepas.org/software/kermor">KerMor</a> and
 * <a href="http://augustine.mit.edu/methodology/methodology_rbAPPmit_Client_Software.htm">rbMIT</a>
 * reduced models is present, where we can only import the rbMIT models that have previously been
 * published with the \ref rbappmit Android application.
 * 
 * @attention
 * This software framework was born out of the \ref rbappmit Android application developed at MIT by Phuong Huynh and David Knezevic.
 * Since then, most of the code has been restructured and -packaged, cleaned up and extended to the current collection of java projects.
 * However, the core part of \ref jrb is still closely related to the original sources and the authors of JaRMoS claim no copyright and publish
 * those parts under the same license conditions as stated at the original website http://augustine.mit.edu/methodology/methodology_rbAPPmit_Client_Software.htm.  
 * Also check out http://augustine.mit.edu/methodology.htm for more background and the current project status.
 * 
 * In order to simply get started, check out the following pages:
 * - \subpage jarmos_download
 * - \subpage jarmos_setup
 * - \subpage jarmos_ownmodels
 * 
 * If you want to extend JaRMoS or include own models, it will be helpful to understand the overall structure.
 * The framework is separated into the following modules:
 * @li @ref jarmosbase
 * @li @ref jarmosa
 * @li @ref jarmospc
 * @li @ref jkermor
 * @li @ref jrb
 * 
 * Please refer to the \subpage licensing for copyright information.
 * 
 * @page licensing JaRMoS license conditions
 * @short This software is available by the The MIT License
 * 
 * The JaRMoS framework as a whole is published under the MIT license stated below.
 * 
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 JaRMoS
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * You should have received a copy of the MIT License along with this program. If not, see
 * <http://opensource.org/licenses/MIT>
 * 
 */

/**
 * @defgroup jarmosmodels JaRMoS Models
 * @short Precomputed models available for simulation with JaRMoS
 * 
 * This module is merely a collection of models that have been previously computed and are available for simulation using JaRMoS.
 * 
 * See \ref jarmos_models and \ref jarmos_ownmodels for more information.
 */ 

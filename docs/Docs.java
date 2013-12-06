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
 * @short This software is available by the GNU GPL license#
 * 
 * The JaRMoS framework as a whole is published under the GNU GPL license stated below.
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>
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

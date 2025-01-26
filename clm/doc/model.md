# Model 

Model grids kinds. Model spectral kinds. Chemistry and physics within the grid. Wave patterns within the spectral. Mixed grid and spectral.

Grid - kinds, limited area, high resolution
* Regular, Grid, 
* Rectilinear Grid, one dimentional latitude and longitude. Concerns; pole singularities, convergence of longitude meridians
* Curviliear Grid, two dimentional coordinates, . Concerns; complex search algo's for interpolation of points around a location.
* Unstructure Grid, nodes and connectivity information, for complex geographical features. Concerns; computationally intensive.
* Geodesic Grid, icosahedron for quasi isotropic representation of surfaces like Earths. Eliminate pole problem in lat/long grids. Concerns; computation intensive?

Spectral - kinds, global forcasting
* to source
* 

spectral model vs grid model  - Brave search
* Gird approach
	* Difference equiations
	* Grid model form; (∂u/∂t) + (ui+1 − ui−1/2Δx) = 0, ui is wind velocity at grid piont i, Δx is grid spacing
* Spectral approach
	* Spherical harmonics
	* Spectral model form; (∂u/∂t) + (∂ψ/∂x) = 0, u is wind velociy, ψ is the stream function

## Status

TODO
* <todo: consider, grid kinds, listing, pros and cons,  >
* <todo: consider, evaluation of grid kinds, for selection of first grid to implement for climate model, >
* <todo: consider, evaluation of spectral kinds, >
* <todo: consider, moving the grid based items to new grid file in geo project \doc, re \geo package \geo\grd code base >

DONE
* <done: intent to commit>

## References

Model kinds
* General Circulation Model GCM, [WP](https://en.wikipedia.org/wiki/General_circulation_model)
* Atmospheric GCM, AGCM, 
* Ocean GCM, OCGM, 
* Coupled Atmosphere Ocean GCM, AOGCM, 

Model kinds, subsystem models
* Earth systems models
* Chemical transport models CTMs,
* Ice sheet models, 
* Land use models, 
* Ozone depletion models,
* ...

Model projections
* Coupled AOCGM, transient climate simulations, 
* 

Cell - unit of grid in which computation takes place
* prognostic equations, 
* diagnostic equations, 
* hydrostatic equations, 
* discretization, finite difference method
* discretization, spectral method
* atmospheric resolution, grid point variables, four, (u,v,T,Q) u,v are wind spead vector, T is temperature, Q is humidity, 
* ocean resoluiton, upto six grid points for every one atmospheric grid point 
* 

Levels - layers of grids or stacks of cells
* to source

Grid - interpolation
* Regridding, grid interpolation, methods
* Destination grid, interpolation to, 
* Source grid, interpolation from, 
* Bilinear, common interpoation method
* Conservative, common interpoation method
* Patch, common interpoation method
* Nearest neighbor, 
* Inverse distance,
* Spline,
* Binning,
* Spectral, 
* Triangulation, 

Grid - concerns
* interpolation
* pole singularieis
* convergence of longitude meridians
* 

Chemistry
* tbd

Physics - fluid dynamics
* Navier Stokes equations
* Baroclinity, [WP](https://en.wikipedia.org/wiki/Baroclinity), atmosphere non alignement of isopycnic surface and isobar surface, ocean non alignment of thermocline and halocline, 
* isopycnic, surface, constant density
* isobar, surface, constant pressure
* thermocline, temperature
* halocline, salinity
* internal gravity wave,
* surface gravity wave, 
* gravity wave, [WP](https://en.wikipedia.org/wiki/Gravity_wave), 
* 

Mathematics
* Differential equations, 

Books
* Grids in Numerical Weather and Climate Models, 22 May 2013, Sarah N Collins, Robert S James, Pallav Ray, Katherine Chen, Angie Lassman and James Brownlee, [DOI](https://doi.org/10.5772/55922), [WS](https://www.intechopen.com/chapters/43438)

Papers
* First- and Second-Order Conservative Remapping Schemes for Grids in Spherical Coordinates, 1 Sep 1999, Philip W. Jones, [DOI](https://doi.org/10.1175/1520-0493(1999)127<2204:FASOCR>2.0.CO;2)

News Papers
* Regridding Overview, 13 Jan 2014 (modified), Dennis Shea, NCAR, [WS](https://climatedataguide.ucar.edu/climate-tools/regridding-overview), grid interpolation, from one resolution to another resolution, temporal, vertical, spacial (horizontal), 
* Climate Data Processing Software, 3 Nov 2017 (modified), Dennis Shea, NCAR, [WS](https://climatedataguide.ucar.edu/climate-tools/climate-data-processing-software), A common question: "What is the best software to use for climate data processing?"


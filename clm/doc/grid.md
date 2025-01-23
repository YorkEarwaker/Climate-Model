# Grid

Model grids kinds. Chemistry and physics within the grid. 

Grid - kinds
* Regular, Grid, 
* Rectilinear Grid, one dimentional latitude and longitude. Concerns; pole singularities, convergence of longitude meridians
* Curviliear Grid, two dimentional coordinates, . Concerns; complex search algo's for interpolation of points around a location.
* Unstructure Grid, nodes and connectivity information, for complex geographical features. Concerns; computationally intensive.
* Geodesic Grid, icosahedron for quasi isotropic representation of surfaces like Earths. Eliminate pole problem in lat/long grids. Concerns; computation intensive?

## Status

TODO
* <todo: consider, grid kinds, listing, pros and cons,  >
* <todo: consider, evaluation of grid kinds, for selection of first grid to implement for climate model, >

DONE
* <done: intent to commit>

## References

Model kinds
* General Circulation Model GCM, [WP](https://en.wikipedia.org/wiki/General_circulation_model)
* Atmospheric GCM, AGCM, 
* Ocean GCM, OCGM, 
* Coupled Atmosphere Ocean GCM, AOGCM, 

Cell - unit of grid in which computation takes place
* prognostic equations, 
* diagnostic equations, 
* hydrostatic equations, 
* 
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

Physics
* Navier Stokes equations

Mathematics
* Differential equations, 

Books
* Grids in Numerical Weather and Climate Models, 22 May 2013, Sarah N Collins, Robert S James, Pallav Ray, Katherine Chen, Angie Lassman and James Brownlee, [DOI](https://doi.org/10.5772/55922), [WS](https://www.intechopen.com/chapters/43438)

Papers
* First- and Second-Order Conservative Remapping Schemes for Grids in Spherical Coordinates, 1 Sep 1999, Philip W. Jones, [DOI](https://doi.org/10.1175/1520-0493(1999)127<2204:FASOCR>2.0.CO;2)

News Papers
* Regridding Overview, 13 Jan 2014 (modified), Dennis Shea, NCAR, [WS](https://climatedataguide.ucar.edu/climate-tools/regridding-overview), grid interpolation, from one resolution to another resolution, temporal, vertical, spacial (horizontal), 
* Climate Data Processing Software, 3 Nov 2017 (modified), Dennis Shea, NCAR, [WS](https://climatedataguide.ucar.edu/climate-tools/climate-data-processing-software), A common question: "What is the best software to use for climate data processing?"


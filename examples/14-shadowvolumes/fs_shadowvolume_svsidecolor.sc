$input v_k

/*
 * Copyright 2013 Dario Manesku. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#include "../common/common.sh"
uniform vec4 u_color;

void main()
{
	gl_FragColor.xyz = u_color.xyz;
	gl_FragColor.w = 0.98;
}

<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:param name="manufacturers">
    <xsl:value-of select="count(/commsim/manufacturer)"/>
  </xsl:param>
    <xsl:param name="retailers">
    <xsl:value-of select="count(/commsim/retailer)"/>
  </xsl:param>
    <xsl:param name="consumers">
    <xsl:value-of select="count(/commsim/consumer)"/>
  </xsl:param>

  <xsl:output method="text" indent="no"/>

  <xsl:template match="/commsim">
    <xsl:if test="count(manufacturer) &lt; $manufacturers or $manufacturers &lt; 1">
      <xsl:message terminate="yes">
				<xsl:text>ERROR: the values of the manufacturers parameter must be in the range [1,count(/commsim/manufacturer)].</xsl:text>
      </xsl:message>
    </xsl:if>
    <xsl:if test="count(consumer) &lt; $consumers or $consumers &lt; 1">
 		  <xsl:message terminate="yes">
				<xsl:text>ERROR: the values of the consumers parameter must be in the range [1,count(/commsim/consumer)].</xsl:text>
      </xsl:message>
    </xsl:if>
    <xsl:if test="count(retailer) &lt; $retailers or $retailers &lt; 1">
      <xsl:message terminate="yes">
				<xsl:text>ERROR: the values of the retailers parameter must be in the range [1,count(/commsim/retailer)].</xsl:text>
      </xsl:message>
    </xsl:if>
    
    <!-- do the one-of processes -->
    <xsl:variable name="processCount" select="count(manufacturer)+count(consumer)+count(retailer)"/>
    <!-- <xsl:text>errorLog@localhost:55555[1>commsim.err]$faninany;</xsl:text> 
    <xsl:value-of select="$NL"/> -->
    <!-- <xsl:text>fanin@localhost:55555[1|fanout:0,2|errorLog:5]$faninany;</xsl:text> -->
    <xsl:text>fanin@localhost:55555[1|fanout:0,2|DUP:1]$faninany;</xsl:text> 
    <xsl:value-of select="$NL"/>

    <!-- <xsl:text>fanout@localhost:55555[1|timekeeper:0, 2|errorLog:6</xsl:text> -->
    <xsl:text>fanout@localhost:55555[1|timekeeper:0</xsl:text> 
    <xsl:call-template name="manufacturerfanout">
    	<xsl:with-param name="mcount" select="$manufacturers - 1"/>
   	</xsl:call-template>
    <xsl:call-template name="retailerfanout">
    	<xsl:with-param name="rcount" select="$retailers - 1"/>
   	</xsl:call-template>
    <xsl:call-template name="consumerfanout">
    	<xsl:with-param name="ccount" select="$consumers - 1"/>
   	</xsl:call-template>
    <xsl:text>]$fanout;</xsl:text>
    <xsl:value-of select="$NL"/>

		<!-- <xsl:text>timekeeper@localhost:55555[1|fanin:7,2|errorLog:7]$vtimekeeper </xsl:text> -->
		<xsl:text>timekeeper@localhost:55555[1|fanin:7,2|DUP:1]$vtimekeeper </xsl:text> 
    <xsl:value-of select="$processCount"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/> 

    <xsl:apply-templates select="manufacturer|retailer|consumer" /> 
  </xsl:template>

  <xsl:template name="manufacturerfanout">
  	<xsl:param name="mcount" />
    <xsl:text>, </xsl:text>
    <xsl:value-of select="$mcount + 4"/>
    <xsl:text>|m</xsl:text>
    <xsl:value-of select="$mcount"/>
    <xsl:text>:0</xsl:text>
    <xsl:if test="$mcount > 0">
    	<xsl:call-template name="manufacturerfanout">
    		<xsl:with-param name="mcount" select="$mcount - 1"/>
   		</xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="retailerfanout">
  	<xsl:param name="rcount" />
    <xsl:text>, </xsl:text>
    <xsl:value-of select="$manufacturers + $rcount + 4"/>
    <xsl:text>|r</xsl:text>
    <xsl:value-of select="$rcount"/>
    <xsl:text>:0</xsl:text>
    <xsl:if test="$rcount > 0">
    	<xsl:call-template name="retailerfanout">
    		<xsl:with-param name="rcount" select="$rcount - 1"/>
   		</xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="consumerfanout">
  	<xsl:param name="ccount" />
    <xsl:text>, </xsl:text>
    <xsl:value-of select="$manufacturers + $retailers + $ccount + 4"/>
    <xsl:text>|c</xsl:text>
    <xsl:value-of select="$ccount"/>
    <xsl:text>:0</xsl:text>
    <xsl:if test="$ccount > 0">
    	<xsl:call-template name="consumerfanout">
    		<xsl:with-param name="ccount" select="$ccount - 1"/>
   		</xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template match="item" mode="manufacturer">
    <xsl:if test="position() &gt; 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="manufacturer">
    <xsl:variable name="counter" select="count(preceding-sibling::manufacturer)" />
    <xsl:variable name="total" select="count(../manufacturer)"/>
 		<xsl:variable name="modval" select="floor(count(../manufacturer) div $manufacturers)" />
    <xsl:variable name="modnum" select="$counter mod $modval" />
    <!-- <xsl:value-of select="$modnum"/> -->
   	<xsl:if test="$modnum = 0">
    	<!-- <xsl:value-of select="@name"/> -->
    	<xsl:text>m</xsl:text>
    	<xsl:value-of select="$counter div $modval"/>
    	<xsl:text>@localhost:55555[1|fanin:</xsl:text>
    	<xsl:value-of select="(($counter div $modval) * 2) + 8"/>
    	<!-- <xsl:text>,2|errorLog:</xsl:text>
    	<xsl:value-of select="(($counter div $modval) * 2) + 8 + 1"/>  -->
    	<xsl:text>,2|DUP:1</xsl:text>
    	<xsl:text>]$manufacturer </xsl:text>
		</xsl:if>    
		<xsl:value-of select="@name" />	
		<xsl:text>|</xsl:text>
   	<xsl:apply-templates select="item" mode="manufacturer"/>
   	<xsl:text> </xsl:text>
   	<xsl:choose>
	    <xsl:when test="$modnum = $modval - 1">
	    	<xsl:text>;</xsl:text>
	    	<xsl:value-of select="$NL"/>
	    </xsl:when>
	    <xsl:when test="$counter = $total - 1">
	    	<xsl:text>;</xsl:text>
	    	<xsl:value-of select="$NL"/>
	    </xsl:when>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="item" mode="retailer">
		<xsl:if test="position() &gt; 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@manufacturer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@unitSize"/>
  </xsl:template>

  <xsl:template match="retailer">
    <xsl:variable name="counter" select="count(preceding-sibling::retailer)" />
    <xsl:variable name="total" select="count(../retailer)"/>
 		<xsl:variable name="modval" select="floor(count(../retailer) div $retailers)" />
    <xsl:variable name="modnum" select="$counter mod $modval" />
		<xsl:if test="$modnum = 0">
	    <!-- <xsl:value-of select="@name"/> -->
     	<xsl:text>r</xsl:text>
    	<xsl:value-of select="$counter div $modval"/>
	    <xsl:text>@localhost:55555[1|fanin:</xsl:text>
	    <xsl:value-of select="(($counter div $modval) * 2) + 8 + $manufacturers * 2"/>
	    <!-- <xsl:text>,2|errorLog:</xsl:text>
	    <xsl:value-of select="(($counter div $modval) * 2) + 8 + 1 + $manufacturers * 2"/> -->
	    <xsl:text>,2|DUP:1</xsl:text>
	    <xsl:text>]$retailer </xsl:text>
	  </xsl:if>
		<xsl:value-of select="@name"/>
		<xsl:text>|</xsl:text>
    <xsl:apply-templates select="item" mode="retailer"/>
    <xsl:text> </xsl:text>
    <xsl:choose>
	    <xsl:when test="$modnum = $modval - 1">
	    	<xsl:text>;</xsl:text>
	    	<xsl:value-of select="$NL"/>
	    </xsl:when>
	    <xsl:when test="$counter = $total - 1">
	    	<xsl:text>;</xsl:text>
	    	<xsl:value-of select="$NL"/>
	    </xsl:when>
    </xsl:choose>
  </xsl:template>

  <xsl:template match="order">
		<xsl:if test="position() &gt; 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@retailer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@item"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@quantity"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="consumer">
		<xsl:variable name="counter" select="count(preceding-sibling::consumer)" />
    <xsl:variable name="total" select="count(../consumer)"/>
 		<xsl:variable name="modval" select="floor(count(../consumer) div $consumers)" />
    <xsl:variable name="modnum" select="$counter mod $modval" />
		<xsl:if test="$modnum = 0">
	    <!-- <xsl:value-of select="@name"/> -->
     	<xsl:text>c</xsl:text>
    	<xsl:value-of select="$counter div $modval"/>
    	<xsl:text>@localhost:55555[1|fanin:</xsl:text>
    	<xsl:value-of select="(($counter div $modval) * 2) + 8 + ($manufacturers * 2) + ($retailers * 2)"/>
    	<!-- <xsl:text>,2|errorLog:</xsl:text>
    	<xsl:value-of select="(($counter div $modval) * 2) + 8 + 1 + ($manufacturers * 2) + ($retailers * 2)"/> -->
	    <xsl:text>,2|DUP:1</xsl:text>
    	<xsl:text>]$consumer </xsl:text>
   	</xsl:if>
    <xsl:value-of select="@name"/>
    <xsl:text>|</xsl:text>
    <xsl:apply-templates select="order"/>
    <xsl:text> </xsl:text>
    <xsl:choose>
	    <xsl:when test="$modnum = $modval - 1">
	    	<xsl:text>;</xsl:text>
	    	<xsl:value-of select="$NL"/>
	    </xsl:when>
	    <xsl:when test="$counter = $total - 1">
	    	<xsl:text>;</xsl:text>
	    	<xsl:value-of select="$NL"/>
	    </xsl:when>
    </xsl:choose>
  </xsl:template>

</xsl:stylesheet>

<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:output method="text" indent="no"/>

  <xsl:template match="/commsim">
    <!-- do the one-of processes -->
    <xsl:variable name="processCount" select="count(manufacturer)+count(consumer)+count(retailer)"/>
    <xsl:text>errorLog@localhost:55555[1>commsim.err]$faninany;</xsl:text>
    <xsl:value-of select="$NL"/>

    <xsl:text>fanin@localhost:55555[1|fanout:0,2|errorLog:5]$faninany;</xsl:text>
    <xsl:value-of select="$NL"/>

    <xsl:text>fanout@localhost:55555[1|timekeeper:0, 2|errorLog:6</xsl:text>
    <xsl:apply-templates select="manufacturer|retailer|consumer" mode="fanout"/>
    <xsl:text>]$fanout;</xsl:text>
    <xsl:value-of select="$NL"/>

    <xsl:text>timekeeper@localhost:55555[1|fanin:7,2|errorLog:7]$vtimekeeper </xsl:text>
    <xsl:value-of select="$processCount"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>

    <xsl:apply-templates select="manufacturer|consumer|retailer"/>
  </xsl:template>

  <xsl:template match="manufacturer|consumer|retailer" mode="fanout">
    <xsl:text>,</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>|</xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:text>:0</xsl:text>
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
    <xsl:value-of select="@name"/>
    <xsl:text>@localhost:55555[1|fanin:</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>,2|errorLog:</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>]$manufacturer </xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:text>|</xsl:text>
    <xsl:apply-templates select="item" mode="manufacturer"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>
  </xsl:template>

  <xsl:template match="item" mode="retailer">
    <xsl:text> </xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@manufacturer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@unitSize"/>
  </xsl:template>

  <xsl:template match="retailer">
    <xsl:value-of select="@name"/>
    <xsl:text>@localhost:55555[1|fanin:</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>,2|errorLog:</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>]$retailer </xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:apply-templates select="item" mode="retailer"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>
  </xsl:template>

  <xsl:template match="order">
    <xsl:text> </xsl:text>
    <xsl:value-of select="@retailer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@item"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@quantity"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="consumer">
    <xsl:value-of select="@name"/>
    <xsl:text>@localhost:55555[1|fanin:</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>,2|errorLog:</xsl:text>
    <xsl:value-of select="position() + 10"/>
    <xsl:text>]$consumer </xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:apply-templates select="order"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>
  </xsl:template>

</xsl:stylesheet>

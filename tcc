<mxfile host="app.diagrams.net" modified="2021-03-19T01:48:30.695Z" agent="5.0 (X11)" etag="yn6ble88IbmT059ItB6q" version="13.9.3" type="github" pages="3">
  <diagram id="GemQWlbEEF1WVqoyGpkD" name="Page-1">
    <mxGraphModel dx="1035" dy="590" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-1" value="Fabrica" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="40" y="150" width="120" height="60" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-2" value="loja" style="rhombus;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="620" y="350" width="80" height="80" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-3" value="Actor" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="640" y="150" width="40" height="60" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-4" value="sistema" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="340" y="150" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-6" value="cadastro de produto" style="endArrow=classic;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="-DrQWTsRjdpKLrsLwvWF-1" target="-DrQWTsRjdpKLrsLwvWF-4">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="400" y="380" as="sourcePoint" />
            <mxPoint x="450" y="330" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-7" value="pedidos" style="endArrow=classic;html=1;entryX=1;entryY=1;entryDx=0;entryDy=0;exitX=0.083;exitY=0.75;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="1" source="-DrQWTsRjdpKLrsLwvWF-4" target="-DrQWTsRjdpKLrsLwvWF-1">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="400" y="380" as="sourcePoint" />
            <mxPoint x="450" y="330" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-11" value="" style="endArrow=classic;html=1;entryX=0.95;entryY=0.35;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" target="-DrQWTsRjdpKLrsLwvWF-4">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="640" y="178" as="sourcePoint" />
            <mxPoint x="450" y="330" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-12" value="envia pedido" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="-DrQWTsRjdpKLrsLwvWF-11">
          <mxGeometry x="0.1828" y="1" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-13" value="" style="endArrow=classic;html=1;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" target="-DrQWTsRjdpKLrsLwvWF-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="660" y="230" as="sourcePoint" />
            <mxPoint x="450" y="330" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-14" value="vende" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="-DrQWTsRjdpKLrsLwvWF-13">
          <mxGeometry x="0.3385" y="3" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-15" value="" style="endArrow=classic;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="-DrQWTsRjdpKLrsLwvWF-1" target="-DrQWTsRjdpKLrsLwvWF-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="400" y="380" as="sourcePoint" />
            <mxPoint x="450" y="330" as="targetPoint" />
            <Array as="points">
              <mxPoint x="100" y="390" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-16" value="Envia produto" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="-DrQWTsRjdpKLrsLwvWF-15">
          <mxGeometry x="-0.4858" y="57" relative="1" as="geometry">
            <mxPoint x="56" y="58" as="offset" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
  <diagram id="4ODW8XWAQr_WrrB54bua" name="Page-2">
    <mxGraphModel dx="1035" dy="590" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-0" />
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-1" parent="2C_G93ytD8yOs3Z3Ru5h-0" />
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-2" value="Fabrica" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="70" y="100" width="120" height="60" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-3" value="loja" style="rhombus;whiteSpace=wrap;html=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="470" y="460" width="80" height="80" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-4" value="Actor" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="670" y="90" width="40" height="60" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-5" value="&lt;div&gt;Sistema&lt;/div&gt;&lt;div&gt;da Fabrica&lt;br&gt;&lt;/div&gt;" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="370" y="100" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-6" value="cadastro de produto" style="endArrow=classic;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" source="2C_G93ytD8yOs3Z3Ru5h-2" target="2C_G93ytD8yOs3Z3Ru5h-5" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="330" as="sourcePoint" />
            <mxPoint x="480" y="280" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-7" value="pedidos" style="endArrow=classic;html=1;entryX=1;entryY=1;entryDx=0;entryDy=0;exitX=0.083;exitY=0.75;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" source="2C_G93ytD8yOs3Z3Ru5h-5" target="2C_G93ytD8yOs3Z3Ru5h-2" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="330" as="sourcePoint" />
            <mxPoint x="480" y="280" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-8" value="" style="endArrow=classic;html=1;entryX=0.95;entryY=0.35;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" target="2C_G93ytD8yOs3Z3Ru5h-5" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="670" y="128" as="sourcePoint" />
            <mxPoint x="480" y="280" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-9" value="envia pedido" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="2C_G93ytD8yOs3Z3Ru5h-8">
          <mxGeometry x="0.1828" y="1" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-14" value="sistema 2" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="630" y="270" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-15" value="" style="endArrow=classic;html=1;entryX=0.483;entryY=0.075;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" target="2C_G93ytD8yOs3Z3Ru5h-14">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="690" y="180" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-21" value="cadastro de produto" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="2C_G93ytD8yOs3Z3Ru5h-15">
          <mxGeometry x="0.2001" y="-2" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-16" value="Actor" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="680" y="470" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-18" value="consulta" style="endArrow=classic;html=1;exitX=0.55;exitY=0.95;exitDx=0;exitDy=0;exitPerimeter=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-14" target="2C_G93ytD8yOs3Z3Ru5h-16">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="696" y="460" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-22" value="Fabrica 2" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="70" y="200" width="120" height="60" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-23" value="&lt;div&gt;sistema &lt;br&gt;&lt;/div&gt;&lt;div&gt;da Fabrica&lt;br&gt;&lt;/div&gt;" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="370" y="200" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-24" value="cadastro de produto" style="endArrow=classic;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-22" target="2C_G93ytD8yOs3Z3Ru5h-23">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="430" as="sourcePoint" />
            <mxPoint x="480" y="380" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-25" value="pedidos" style="endArrow=classic;html=1;entryX=1;entryY=1;entryDx=0;entryDy=0;exitX=0.083;exitY=0.75;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-23" target="2C_G93ytD8yOs3Z3Ru5h-22">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="430" as="sourcePoint" />
            <mxPoint x="480" y="380" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-27" value="" style="endArrow=classic;html=1;exitX=0;exitY=1;exitDx=0;exitDy=0;exitPerimeter=0;entryX=0.88;entryY=0.25;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-4" target="2C_G93ytD8yOs3Z3Ru5h-23">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="600" y="220" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-28" value="envia pedido" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="2C_G93ytD8yOs3Z3Ru5h-27">
          <mxGeometry x="0.2124" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-30" value="" style="endArrow=classic;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;exitX=0.5;exitY=0.5;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-16" target="2C_G93ytD8yOs3Z3Ru5h-3">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="670" y="500" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-31" value="" style="endArrow=classic;html=1;exitX=0.417;exitY=1.05;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;exitPerimeter=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-22" target="2C_G93ytD8yOs3Z3Ru5h-3">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="120" y="500" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-32" value="" style="endArrow=classic;html=1;exitX=0;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="120" y="350" as="targetPoint" />
            <Array as="points">
              <mxPoint x="40" y="130" />
              <mxPoint x="40" y="350" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-33" value="Envia produto" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;" vertex="1" parent="2C_G93ytD8yOs3Z3Ru5h-1">
          <mxGeometry x="160" y="480" width="100" height="20" as="geometry" />
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-34" value="" style="endArrow=classic;html=1;exitX=0.75;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-22" target="2C_G93ytD8yOs3Z3Ru5h-3">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="160" y="460" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-35" value="Boleto" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="2C_G93ytD8yOs3Z3Ru5h-34">
          <mxGeometry x="-0.28" y="99" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-36" value="" style="endArrow=classic;html=1;entryX=0.5;entryY=0;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" edge="1" parent="2C_G93ytD8yOs3Z3Ru5h-1" source="2C_G93ytD8yOs3Z3Ru5h-2" target="2C_G93ytD8yOs3Z3Ru5h-4">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="120" y="90" as="sourcePoint" />
            <mxPoint x="450" y="280" as="targetPoint" />
            <Array as="points">
              <mxPoint x="130" y="60" />
              <mxPoint x="690" y="60" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="2C_G93ytD8yOs3Z3Ru5h-37" value="Pagamento de comissão" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="2C_G93ytD8yOs3Z3Ru5h-36">
          <mxGeometry x="-0.3111" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
  <diagram id="sgFFr4-AXA7fldLDxMua" name="Page-3">
    <mxGraphModel dx="1035" dy="590" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-0" />
        <mxCell id="C-6PtKUWlW536hTK4Sfw-1" parent="C-6PtKUWlW536hTK4Sfw-0" />
        <mxCell id="C-6PtKUWlW536hTK4Sfw-2" value="Fabrica" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="70" y="100" width="120" height="60" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-3" value="loja" style="rhombus;whiteSpace=wrap;html=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="470" y="460" width="80" height="80" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-4" value="gerente" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="670" y="90" width="40" height="60" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-5" value="&lt;div&gt;Sistema&lt;/div&gt;&lt;div&gt;da Fabrica&lt;br&gt;&lt;/div&gt;" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="370" y="100" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-6" value="cadastro de produto" style="endArrow=classic;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-2" target="C-6PtKUWlW536hTK4Sfw-5">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="330" as="sourcePoint" />
            <mxPoint x="480" y="280" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-7" value="pedidos" style="endArrow=classic;html=1;entryX=1;entryY=1;entryDx=0;entryDy=0;exitX=0.083;exitY=0.75;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-5" target="C-6PtKUWlW536hTK4Sfw-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="330" as="sourcePoint" />
            <mxPoint x="480" y="280" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-8" value="" style="endArrow=classic;html=1;entryX=0.96;entryY=0.7;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" target="C-6PtKUWlW536hTK4Sfw-5">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="650" y="330" as="sourcePoint" />
            <mxPoint x="480" y="280" as="targetPoint" />
            <Array as="points">
              <mxPoint x="490" y="330" />
              <mxPoint x="490" y="320" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-9" value="envia pedido" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="C-6PtKUWlW536hTK4Sfw-8">
          <mxGeometry x="0.1828" y="1" relative="1" as="geometry">
            <mxPoint x="2.49" y="17.63" as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-10" value="sistema 2" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="630" y="270" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-11" value="" style="endArrow=classic;html=1;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.96;exitY=0.7;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" target="C-6PtKUWlW536hTK4Sfw-10" source="C-6PtKUWlW536hTK4Sfw-5">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="690" y="180" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-12" value="cadastro de produto" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="C-6PtKUWlW536hTK4Sfw-11">
          <mxGeometry x="0.2001" y="-2" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-13" value="vendedor" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="680" y="470" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-14" value="consulta" style="endArrow=classic;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;exitPerimeter=0;entryX=0.55;entryY=0.95;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-13" target="C-6PtKUWlW536hTK4Sfw-10">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="790" y="380" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-15" value="Fabrica 2" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="70" y="200" width="120" height="60" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-16" value="&lt;div&gt;sistema &lt;br&gt;&lt;/div&gt;&lt;div&gt;da Fabrica&lt;br&gt;&lt;/div&gt;" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="370" y="200" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-17" value="cadastro de produto" style="endArrow=classic;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-15" target="C-6PtKUWlW536hTK4Sfw-16">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="430" as="sourcePoint" />
            <mxPoint x="480" y="380" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-18" value="pedidos" style="endArrow=classic;html=1;entryX=1;entryY=1;entryDx=0;entryDy=0;exitX=0.083;exitY=0.75;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-16" target="C-6PtKUWlW536hTK4Sfw-15">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="430" as="sourcePoint" />
            <mxPoint x="480" y="380" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-19" value="" style="endArrow=classic;html=1;exitX=0.13;exitY=0.77;exitDx=0;exitDy=0;exitPerimeter=0;entryX=0.55;entryY=0.95;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-10" target="C-6PtKUWlW536hTK4Sfw-16">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="436" y="330" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-20" value="envia pedido" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="C-6PtKUWlW536hTK4Sfw-19">
          <mxGeometry x="0.2124" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-21" value="" style="endArrow=classic;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;exitX=0.5;exitY=0.5;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-13" target="C-6PtKUWlW536hTK4Sfw-3">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="670" y="500" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-22" value="" style="endArrow=classic;html=1;exitX=0.417;exitY=1.05;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;exitPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-15" target="C-6PtKUWlW536hTK4Sfw-3">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="120" y="500" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-23" value="" style="endArrow=classic;html=1;exitX=0;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="120" y="350" as="targetPoint" />
            <Array as="points">
              <mxPoint x="40" y="130" />
              <mxPoint x="40" y="350" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-24" value="Envia produto" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;" vertex="1" parent="C-6PtKUWlW536hTK4Sfw-1">
          <mxGeometry x="160" y="480" width="100" height="20" as="geometry" />
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-25" value="" style="endArrow=classic;html=1;exitX=0.75;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-15" target="C-6PtKUWlW536hTK4Sfw-3">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="430" y="390" as="sourcePoint" />
            <mxPoint x="480" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="160" y="460" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-26" value="Boleto" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="C-6PtKUWlW536hTK4Sfw-25">
          <mxGeometry x="-0.28" y="99" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-27" value="" style="endArrow=classic;html=1;entryX=0.5;entryY=0;entryDx=0;entryDy=0;entryPerimeter=0;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" source="C-6PtKUWlW536hTK4Sfw-2" target="C-6PtKUWlW536hTK4Sfw-4">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="120" y="90" as="sourcePoint" />
            <mxPoint x="450" y="280" as="targetPoint" />
            <Array as="points">
              <mxPoint x="130" y="60" />
              <mxPoint x="690" y="60" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-28" value="Pagamento de comissão" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="C-6PtKUWlW536hTK4Sfw-27">
          <mxGeometry x="-0.3111" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-33" value="" style="endArrow=classic;html=1;entryX=0.5;entryY=0.125;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="C-6PtKUWlW536hTK4Sfw-1" target="C-6PtKUWlW536hTK4Sfw-10">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="690" y="170" as="sourcePoint" />
            <mxPoint x="450" y="280" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="C-6PtKUWlW536hTK4Sfw-34" value="gera relatorios" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="C-6PtKUWlW536hTK4Sfw-33">
          <mxGeometry x="-0.1818" y="-1" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
